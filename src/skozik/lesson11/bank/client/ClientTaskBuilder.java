/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.client;

import java.math.BigDecimal;

import skozik.lesson11.bank.currency.CurrencyAmount;
import skozik.lesson11.bank.currency.CurrencyType;
import skozik.lesson11.bank.office.OfficeManager;
import skozik.lesson11.bank.transaction.ClientTransactionDeposit;
import skozik.lesson11.bank.transaction.ClientTransactionType;
import skozik.lesson11.bank.transaction.ClientTransactionWithdraw;
import skozik.lesson11.bank.transaction.IClientTransaction;

public class ClientTaskBuilder {
    private String id;
    private String account;
    private ClientTransactionType transactionType;
    private BigDecimal amount;
    private CurrencyType currency;
    private OfficeManager officeManager;

    public ClientTaskBuilder(OfficeManager officeManager) {
        this.officeManager = officeManager;
    }

    public ClientTaskBuilder setClientId(String id) {
        this.id = id;
        return this;
    }

    public ClientTaskBuilder setAccount(String account) {
        this.account = account;
        return this;
    }

    public ClientTaskBuilder setTransactionType(ClientTransactionType transactionType) {
        this.transactionType = transactionType;
        return this;
    }

    public ClientTaskBuilder setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public ClientTaskBuilder setCurrency(CurrencyType currency) {
        this.currency = currency;
        return this;
    }

    public ClientTask build() {
        IClientTransaction clientTransaction = null;
        switch (this.transactionType) {
            case DEPOSIT:
                clientTransaction = new ClientTransactionDeposit(
                    this.account, new CurrencyAmount(this.amount, this.currency));
                break;
            case WITHDRAW:
                clientTransaction = new ClientTransactionWithdraw(
                    this.account, new CurrencyAmount(this.amount, this.currency));
                break;
        }
        return new ClientTask(
            this.id,
            clientTransaction,
            officeManager);
    }
}