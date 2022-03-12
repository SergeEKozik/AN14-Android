/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.common;

import static skozik.lesson11.bank.BankConstants.MAX_COINS_NUMBER;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

import skozik.lesson11.bank.client.ClientTask;
import skozik.lesson11.bank.client.ClientTaskBuilder;
import skozik.lesson11.bank.currency.CurrencyType;
import skozik.lesson11.bank.dao.AccountDao;
import skozik.lesson11.bank.office.OfficeManager;
import skozik.lesson11.bank.transaction.ClientTransactionType;
import skozik.lesson11.bank.treasury.Treasury;

public class BankUtil {
    private static Random random = new Random();

    public static void getAndAddAtomicReference(AtomicReference<BigDecimal> currentAmount, BigDecimal augend) {
        BigDecimal oldVal;
        do {
            oldVal = currentAmount.get();
        } while (!currentAmount.compareAndSet(oldVal, oldVal.add(augend)));
    }

    public static void getAndSubtractAtomicReference(AtomicReference<BigDecimal> currentAmount, BigDecimal subtrahend) {
        BigDecimal oldVal;
        do {
            oldVal = currentAmount.get();
        } while (!currentAmount.compareAndSet(oldVal, oldVal.subtract(subtrahend)));
    }

    public static List<ClientTask> generateClientTasks(int numberOfTasks, String[] accounts, int maxAmount, OfficeManager officeManager) {
        List<ClientTask> result = new ArrayList<>();
        for (int i = 0; i < numberOfTasks; i++) {
            String account = accounts[random.nextInt(accounts.length)];
            String amount = String.format("%s.%s", random.nextInt(maxAmount), random.nextInt(MAX_COINS_NUMBER));
            CurrencyType currency = AccountDao.getAccountValue(account).getCurrencyType();
            ClientTransactionType transactionType = ClientTransactionType.values()[random.nextInt(ClientTransactionType.values().length)];
            result.add(
                new ClientTaskBuilder(officeManager)
                    .setClientId(String.valueOf(i))
                    .setAccount(account)
                    .setAmount(new BigDecimal(amount))
                    .setCurrency(currency)
                    .setTransactionType(transactionType)
                    .build()
            );
        }
        return result;
    }
}
