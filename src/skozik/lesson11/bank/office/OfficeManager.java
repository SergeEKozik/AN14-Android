/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.office;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.exception.ExceptionCode;
import skozik.lesson11.bank.transaction.AbstractTransaction;
import skozik.lesson11.bank.transaction.IClientTransaction;

public class OfficeManager {
    private SynchronousQueue<AbstractTransaction> transactionQueue;
    private int numberOfCashier;

    public OfficeManager(int numberOfCashier) {
        this.transactionQueue = new SynchronousQueue<>();
        this.numberOfCashier = numberOfCashier;
        startCashierPool();
    }

    private void startCashierPool() {
        ExecutorService executor = Executors.newFixedThreadPool(this.numberOfCashier);
        for (int i = 0; i < this.numberOfCashier; i++) {
            executor.submit(new CashierTask(this));
        }
    }

    public boolean produce(AbstractTransaction transaction) throws BankException {
        try {
            return transactionQueue.offer(transaction, 3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new BankException(ExceptionCode.BEM_0001, e);
        }
    }

    public IClientTransaction getClientTask() throws BankException {
        try {
            return this.transactionQueue.take();
        } catch (InterruptedException e) {
            throw new BankException(ExceptionCode.BEM_0002, e);
        }
    }
}
