/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.client;

import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.office.OfficeManager;
import skozik.lesson11.bank.transaction.ClientTransactionResult;
import skozik.lesson11.bank.transaction.IClientTransaction;
import skozik.lesson11.bank.userinterface.Renderer;

public class ClientTask implements Runnable {
    private String id;
    private IClientTransaction clientTransaction;
    private OfficeManager officeManager;

    public ClientTask(String id, IClientTransaction clientTransaction,
                      OfficeManager officeManager) {
        this.id = id;
        this.clientTransaction = clientTransaction;
        this.officeManager = officeManager;
    }

    @Override
    public void run() {
        try {
            officeManager.produce(this.clientTransaction);
            ClientTransactionResult transactionResult = this.clientTransaction.getResult();
            Renderer.printMessage(this.id, this.clientTransaction.getType().name(), String.valueOf(transactionResult));
        } catch (BankException e) {
            Renderer.printMessage(this.id, this.clientTransaction.getType().name(), e.getMessage());
        }
    }
}