/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.treasury;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import skozik.lesson11.bank.BankConstants;
import skozik.lesson11.bank.currency.CurrencyType;

public class CheckTreasuryJob implements Runnable {

    private static HashMap<CurrencyType, BigDecimal> maxLimits = new HashMap<>();
    private static HashMap<CurrencyType, BigDecimal> minLimits = new HashMap<>();
    static {
        maxLimits.put(CurrencyType.TALENT, BankConstants.CURRENCY_TALENT_MAX_TREASURY_LIMIT);
        minLimits.put(CurrencyType.TALENT, BankConstants.CURRENCY_TALENT_MIN_TREASURY_LIMIT);
    }


    @Override
    public void run() {
        for (Map.Entry<CurrencyType, BigDecimal> minLimit : minLimits.entrySet()) {
            AtomicReference<BigDecimal> currentAmount = Treasury.getCurrencyAmount(minLimit.getKey());
            BigDecimal oldVal = currentAmount.get();
            if (oldVal.compareTo(minLimit.getValue()) < 0) {
                do {
                    oldVal = currentAmount.get();
                } while (!currentAmount.compareAndSet(oldVal,
                    oldVal.add(BankConstants.CURRENCY_TALENT_TRANCHE_TREASURY)));
            }
        }
        for (Map.Entry<CurrencyType, BigDecimal> maxLimit : maxLimits.entrySet()) {
            AtomicReference<BigDecimal> currentAmount = Treasury.getCurrencyAmount(maxLimit.getKey());
            BigDecimal oldVal = currentAmount.get();
            if (oldVal.compareTo(maxLimit.getValue()) > 0) {
                BigDecimal difference = oldVal.subtract(maxLimit.getValue());
                do {
                    oldVal = currentAmount.get();
                } while (!currentAmount.compareAndSet(oldVal, oldVal.subtract(difference)));
            }
        }
    }
}
