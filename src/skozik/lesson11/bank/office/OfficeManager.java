/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.office;

import static skozik.lesson11.bank.BankConstants.CASHIER_POOL_STOP_WAIT_SEC;
import static skozik.lesson11.bank.BankConstants.CASHIER_TASK_PERIOD_CHECK_MS;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.exception.ExceptionCode;
import skozik.lesson11.bank.transaction.AbstractTransaction;
import skozik.lesson11.bank.transaction.IClientTransaction;
import skozik.lesson11.bank.userinterface.Renderer;

public class OfficeManager {
    private SynchronousQueue<AbstractTransaction> transactionQueue;
    private int numberOfCashier;
    private ExecutorService cashierPool;
    private List<CashierTask> cashierTasks = new ArrayList<>();

    public OfficeManager(int numberOfCashier) {
        this.transactionQueue = new SynchronousQueue<>();
        this.numberOfCashier = numberOfCashier;
        startCashierPool();
    }

    private void startCashierPool() {
        cashierPool = Executors.newFixedThreadPool(this.numberOfCashier);
        for (int i = 0; i < this.numberOfCashier; i++) {
            CashierTask task = new CashierTask(this);
            this.cashierTasks.add(task);
            cashierPool.submit(task);
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
            return this.transactionQueue.poll(CASHIER_TASK_PERIOD_CHECK_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new BankException(ExceptionCode.BEM_0002, e);
        }
    }

    public void stopCashierPool() {
        for (CashierTask task : this.cashierTasks) {
            task.setActive(false);
        }
        try {
            cashierPool.shutdown();
            cashierPool.awaitTermination(CASHIER_POOL_STOP_WAIT_SEC, TimeUnit.SECONDS);
        } catch (Exception e) {
            Renderer.printMessage(e.getMessage());
        } finally {
            cashierPool.shutdownNow();
        }
    }
}
