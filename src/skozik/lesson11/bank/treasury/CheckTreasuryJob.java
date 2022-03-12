/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.treasury;

import static skozik.lesson11.bank.BankConstants.TREASURY_JOB_START_REPORT;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import skozik.lesson11.bank.BankConstants;
import skozik.lesson11.bank.common.BankUtil;
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
        Renderer.printMessage(String.format(TREASURY_JOB_START_REPORT,
            Treasury.getTreasury().entrySet().stream()
                .map(e -> String.format("%s%s", e.getValue().get(), e.getKey().getShortName()))
                .collect(Collectors.joining(","))));
        checkForMinimumLimits();
        checkForMaximumLimits();
    }

    private void checkForMinimumLimits() {
        for (Map.Entry<CurrencyType, BigDecimal> minLimit : minLimits.entrySet()) {
            AtomicReference<BigDecimal> currentAmount = Treasury.getCurrencyAmount(minLimit.getKey());
            BigDecimal oldVal = currentAmount.get();
            if (oldVal.compareTo(minLimit.getValue()) < 0) {
                moveCashFromRemoteStorageToTreasury(currentAmount, BankConstants.CURRENCY_TALENT_TRANCHE_TREASURY,
                    minLimit.getKey().getShortName());
            }
        }
    }

    private static void moveCashFromRemoteStorageToTreasury(AtomicReference<BigDecimal> currentAmount,
                                                            BigDecimal amount, String currencyCode) {
        BankUtil.getAndAddAtomicReference(currentAmount, amount);
        Renderer.printMessage(
            String.format(
                BankConstants.TREASURY_ADD_JOB_REPORT,
                amount,
                currencyCode));
    }

    private void checkForMaximumLimits() {
        for (Map.Entry<CurrencyType, BigDecimal> maxLimit : maxLimits.entrySet()) {
            AtomicReference<BigDecimal> currentAmount = Treasury.getCurrencyAmount(maxLimit.getKey());
            BigDecimal oldVal = currentAmount.get();
            if (oldVal.compareTo(maxLimit.getValue()) > 0) {
                BigDecimal difference = oldVal.subtract(maxLimit.getValue());
                moveCashFromTreasuryAway(currentAmount, difference, maxLimit.getKey().getShortName());
            }
        }
    }

    private void moveCashFromTreasuryAway(AtomicReference<BigDecimal> currentAmount, BigDecimal amount,
                                          String currencyCode) {
        BankUtil.getAndSubtractAtomicReference(currentAmount, amount);
        Renderer.printMessage(
            String.format(
                BankConstants.TREASURY_REMOVE_JOB_REPORT,
                amount,
                currencyCode));
    }
}