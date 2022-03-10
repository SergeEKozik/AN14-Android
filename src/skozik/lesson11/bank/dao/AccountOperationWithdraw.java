/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.dao;

import static skozik.lesson11.bank.BankConstants.DEPOSIT_REPORT_FORMAT;
import static skozik.lesson11.bank.BankConstants.STATUS_OK;
import static skozik.lesson11.bank.BankConstants.WITHDRAW_REPORT_FORMAT;

import skozik.lesson11.bank.currency.CurrencyAmount;
import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.transaction.ClientTransactionResult;

public class AccountOperationWithdraw implements IAccountOperation {
    private String account;
    private CurrencyAmount amount;

    public AccountOperationWithdraw(String account, CurrencyAmount amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public ClientTransactionResult execute() throws BankException {
        ClientTransactionResult transactionResult = new ClientTransactionResult();
        AccountDao.withdraw(account, amount);
        transactionResult.setStatus(STATUS_OK);
        transactionResult.setMessage(String.format(WITHDRAW_REPORT_FORMAT, account, amount));
        return transactionResult;
    }
}
