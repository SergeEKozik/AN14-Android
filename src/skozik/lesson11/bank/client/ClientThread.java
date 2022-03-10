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
import skozik.lesson11.bank.userinterface.IRenderer;

public class ClientThread implements Runnable {
    private String id;
    private IClientTransaction clientTransaction;
    private OfficeManager officeManager;
    private IRenderer renderer;

    public ClientThread(String id, IClientTransaction clientTransaction,
                        OfficeManager officeManager, IRenderer renderer) {
        this.id = id;
        this.clientTransaction = clientTransaction;
        this.officeManager = officeManager;
        this.renderer = renderer;
    }

    @Override
    public void run() {
        try {
            this.clientTransaction.dispatch(officeManager);
            ClientTransactionResult transactionResult = this.clientTransaction.getResult();
            renderer.printMessage(this.id, this.clientTransaction.getType().name(), String.valueOf(transactionResult));
        } catch (BankException e) {
            renderer.printMessage(this.id, this.clientTransaction.getType().name(), e.getMessage());
        }
    }
}