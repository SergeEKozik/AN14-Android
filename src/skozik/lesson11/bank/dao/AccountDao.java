/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;

import skozik.lesson11.bank.common.LockChannel;
import skozik.lesson11.bank.currency.CurrencyAmount;
import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.exception.ExceptionCode;
import skozik.lesson11.bank.treasury.Treasury;

public class AccountDao {
    private static ConcurrentMap<String, CurrencyAmount> bankAccounts = new ConcurrentHashMap<>();
    private static LockChannel lockChannel = new LockChannel("Dao-lockchannel");

    public static void setAccounts(Map<String, CurrencyAmount> accounts) {
        for (Map.Entry<String, CurrencyAmount> entry : accounts.entrySet()) {
            bankAccounts.put(entry.getKey(), entry.getValue());
        }
    }

    public static void withdraw(String account, CurrencyAmount amount) throws BankException {
        Lock lock = lockChannel.getLock(account);
        lock.lock();
        try {
            CurrencyAmount currentAmount = validateAccountAndGet(account);
            validateCurrency(currentAmount, amount);
            if (currentAmount.getAmount().compareTo(amount.getAmount()) < 0) {
                throw new BankException(ExceptionCode.BEM_0006);
            }
            Treasury.releaseCash(amount);
            currentAmount.setAmount(currentAmount.getAmount().subtract(amount.getAmount()));
        } finally {
            lock.unlock();
        }
    }
    public static void deposit(String account, CurrencyAmount amount) throws BankException {
        Lock lock = lockChannel.getLock(account);
        lock.lock();
        try {
            CurrencyAmount currentAmount = validateAccountAndGet(account);
            validateCurrency(currentAmount, amount);
            Treasury.storeCash(amount);
            currentAmount.setAmount(currentAmount.getAmount().add(amount.getAmount()));
        } finally {
            lock.unlock();
        }
    }

    private static CurrencyAmount validateAccountAndGet(String account) throws BankException {
        CurrencyAmount currentAmount = bankAccounts.get(account);
        if (currentAmount == null) {
            throw new BankException(ExceptionCode.BEM_0004);
        }
        return currentAmount;
    }

    private static void validateCurrency(CurrencyAmount currentAmount, CurrencyAmount amount) throws BankException {
        if (currentAmount.getCurrencyType() != amount.getCurrencyType()) {
            throw new BankException(ExceptionCode.BEM_0005);
        }
    }
}