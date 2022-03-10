/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.treasury;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import skozik.lesson11.bank.BankConstants;
import skozik.lesson11.bank.currency.CurrencyType;
import skozik.lesson11.bank.userinterface.Renderer;

public class CheckTreasuryJob implements Runnable {

    private static final EnumMap<CurrencyType, BigDecimal> maxLimits = new EnumMap<>(CurrencyType.class);
    private static final EnumMap<CurrencyType, BigDecimal> minLimits = new EnumMap<>(CurrencyType.class);
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
                Renderer.printMessage(
                    String.format(
                        BankConstants.TREASURY_ADD_JOB_REPORT,
                        BankConstants.CURRENCY_TALENT_TRANCHE_TREASURY,
                        minLimit.getKey().getShortName()));
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
                Renderer.printMessage(
                    String.format(
                        BankConstants.TREASURY_REMOVE_JOB_REPORT,
                        difference,
                        maxLimit.getKey().getShortName()));
            }
        }
    }
}
