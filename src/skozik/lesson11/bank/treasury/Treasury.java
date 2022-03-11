/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.treasury;

import static skozik.lesson11.bank.BankConstants.TREASURY_CHECK_JOB_PERIOD_SEC;

import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

import skozik.lesson11.bank.common.BankUtil;
import skozik.lesson11.bank.currency.CurrencyAmount;
import skozik.lesson11.bank.currency.CurrencyType;
import skozik.lesson11.bank.userinterface.Renderer;

public class Treasury {
    private static final ConcurrentMap<CurrencyType, AtomicReference<BigDecimal>> amounts = new ConcurrentHashMap<>();
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public static void startJob() {
        scheduler.scheduleAtFixedRate(new CheckTreasuryJob(), 0, TREASURY_CHECK_JOB_PERIOD_SEC, TimeUnit.SECONDS);
    }

    public static void releaseCash(CurrencyAmount amount) {
        AtomicReference<BigDecimal> currentAmount = amounts.computeIfAbsent(amount.getCurrencyType(), c -> new AtomicReference<>(BigDecimal.ZERO));
        BankUtil.getAndSubtractAtomicReference(currentAmount, amount.getAmount());
    }

    public static void storeCash(CurrencyAmount amount) {
        AtomicReference<BigDecimal> currentAmount = amounts.computeIfAbsent(amount.getCurrencyType(), c -> new AtomicReference<>(BigDecimal.ZERO));
        BankUtil.getAndAddAtomicReference(currentAmount, amount.getAmount());
    }

    public static AtomicReference<BigDecimal> getCurrencyAmount(CurrencyType type) {
        return amounts.computeIfAbsent(type, c -> new AtomicReference<>(BigDecimal.ZERO));
    }

    public static void stopJob() {
        try {
            scheduler.shutdown();
            scheduler.awaitTermination(TREASURY_CHECK_JOB_PERIOD_SEC, TimeUnit.SECONDS);
        } catch (Exception e) {
            Renderer.printMessage(e.getMessage());
        } finally {
            scheduler.shutdownNow();
        }
    }
}