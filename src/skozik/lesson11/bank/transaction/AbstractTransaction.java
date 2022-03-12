/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.transaction;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.exception.ExceptionCode;

public class AbstractTransaction implements IClientTransaction {
    private ReentrantLock locker = new ReentrantLock();
    private Condition condition = locker.newCondition();
    protected ClientTransactionType clientTransactionType;
    protected ClientTransactionResult transactionResult = null;

    public AbstractTransaction(ClientTransactionType clientTransactionType) {
        this.clientTransactionType = clientTransactionType;
    }

    public ClientTransactionResult getResult() throws BankException {
        locker.lock();
        try {
            while (this.transactionResult == null) {
                condition.await();
            }
        } catch (InterruptedException e) {
            throw new BankException(ExceptionCode.BEM_0003, e);
        } finally {
            locker.unlock();
        }
        return this.transactionResult;
    }

    public void putResult(ClientTransactionResult result) throws BankException {
        locker.lock();
        try {
            this.transactionResult = result;
            condition.signalAll();
        } catch (Exception e) {
            throw new BankException(ExceptionCode.BEM_0003, e);
        } finally {
            locker.unlock();
        }
    }

    @Override
    public ClientTransactionType getType() {
        return this.clientTransactionType;
    }
}