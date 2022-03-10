/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.transaction;

import skozik.lesson11.bank.currency.CurrencyAmount;

public class ClientTransactionDeposit extends AbstractTransaction {
    private String account;
    private CurrencyAmount amount;

    public ClientTransactionDeposit(String account,
                                     CurrencyAmount amount) {
        super(ClientTransactionType.DEPOSIT);
        this.account = account;
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public CurrencyAmount getAmount() {
        return amount;
    }
}
