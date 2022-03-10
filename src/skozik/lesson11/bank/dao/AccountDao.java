/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import skozik.lesson11.bank.currency.CurrencyAmount;
import skozik.lesson11.bank.exception.BankException;

public class AccountDao {
    private static ConcurrentMap<String, CurrencyAmount> bankAccounts = new ConcurrentHashMap<>();

    public static void setAccounts(Map<String, CurrencyAmount> accounts) {
        for (Map.Entry<String, CurrencyAmount> entry : accounts.entrySet()) {
            bankAccounts.put(entry.getKey(), entry.getValue());
        }
    }

    public static void withdraw(String account, CurrencyAmount amount) throws BankException {
        throw new RuntimeException("Not implemented");
    }
    public static void deposit(String account, CurrencyAmount amount) throws BankException {
        throw new RuntimeException("Not implemented");
    }
}
