/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.treasury;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import skozik.lesson11.bank.BankConstants;
import skozik.lesson11.bank.currency.CurrencyAmount;
import skozik.lesson11.bank.currency.CurrencyType;

public class Treasury {
    private static final ConcurrentMap<CurrencyType, AtomicReference<BigDecimal>> amounts = new ConcurrentHashMap<>();
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    static {
        scheduler.scheduleAtFixedRate(new CheckTreasuryJob(), 0, BankConstants.TREASURY_CHECK_JOB_PERIOD_SEC, TimeUnit.SECONDS);
    }

    public static void releaseCash(CurrencyAmount amount) {
        AtomicReference<BigDecimal> currentAmount = amounts.computeIfAbsent(amount.getCurrencyType(), c -> new AtomicReference<>(BigDecimal.ZERO));
        while (true) {
            BigDecimal oldVal = currentAmount.get();
            if (currentAmount.compareAndSet(oldVal, oldVal.subtract(amount.getAmount())))
                return;
        }
    }

    public static void storeCash(CurrencyAmount amount) {
        AtomicReference<BigDecimal> currentAmount = amounts.computeIfAbsent(amount.getCurrencyType(), c -> new AtomicReference<>(BigDecimal.ZERO));
        while (true) {
            BigDecimal oldVal = currentAmount.get();
            if (currentAmount.compareAndSet(oldVal, oldVal.add(amount.getAmount())))
                return;
        }
    }

    public static AtomicReference<BigDecimal> getCurrencyAmount(CurrencyType type) {
        return amounts.computeIfAbsent(type, c -> new AtomicReference<>(BigDecimal.ZERO));
    }
}