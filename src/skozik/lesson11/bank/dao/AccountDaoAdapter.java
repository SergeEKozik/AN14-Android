/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.dao;

import static skozik.lesson11.bank.BankConstants.STATUS_ERROR;
import skozik.lesson11.bank.transaction.ClientTransactionDeposit;
import skozik.lesson11.bank.transaction.ClientTransactionResult;
import skozik.lesson11.bank.transaction.ClientTransactionWithdraw;

public class AccountDaoAdapter {

    public static ClientTransactionResult withdraw(ClientTransactionWithdraw clientTransaction) {
        return processTransaction(new AccountOperationWithdraw(clientTransaction.getAccount(),
            clientTransaction.getAmount()));
    }

    public static ClientTransactionResult deposit(ClientTransactionDeposit clientTransaction) {
        return processTransaction(new AccountOperationDeposit(clientTransaction.getAccount(),
            clientTransaction.getAmount()));
    }

    private static ClientTransactionResult processTransaction(IAccountOperation operation) {
        ClientTransactionResult transactionResult;
        try {
            transactionResult = operation.execute();
        } catch (Exception e) {
            transactionResult = new ClientTransactionResult();
            transactionResult.setStatus(STATUS_ERROR);
            transactionResult.setMessage(e.getMessage());
        }
        return transactionResult;
    }
}
