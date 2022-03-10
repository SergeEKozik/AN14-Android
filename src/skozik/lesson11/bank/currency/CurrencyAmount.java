/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.currency;

import java.math.BigDecimal;

public class CurrencyAmount {
    private BigDecimal amount;
    private CurrencyType currencyType;

    public CurrencyAmount(BigDecimal amount, CurrencyType currencyType) {
        this.amount = amount;
        this.currencyType = currencyType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    @Override
    public String toString() {
        return amount.toString() + currencyType.getShortName();
    }
}
