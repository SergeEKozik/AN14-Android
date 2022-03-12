/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank;

import static skozik.lesson11.bank.BankConstants.BANK_WORKING_TIME_SEC;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import skozik.lesson11.bank.client.ClientTask;
import skozik.lesson11.bank.common.BankUtil;
import skozik.lesson11.bank.currency.CurrencyAmount;
import skozik.lesson11.bank.currency.CurrencyType;
import skozik.lesson11.bank.dao.AccountDao;
import skozik.lesson11.bank.office.OfficeManager;
import skozik.lesson11.bank.treasury.Treasury;

public class Main {
    public static void main(String[] args) {
        String[] accounts = new String[] {"111", "222", "333", "444"};
        OfficeManager officeManager = new OfficeManager(4);
        AccountDao.setAccounts(Arrays.stream(accounts).collect(Collectors.toMap(a -> a, a -> new CurrencyAmount(BigDecimal.ZERO, CurrencyType.TALENT))));
        Treasury.startJob();
        int numberOfTasks = 10;
        List<ClientTask> clientTasks = BankUtil.generateClientTasks(numberOfTasks, accounts, 100, officeManager);
        for (ClientTask clientTask : clientTasks) {
            new Thread(clientTask).start();
        }
        try {
            Thread.sleep(BANK_WORKING_TIME_SEC * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Treasury.stopJob();
        officeManager.stopCashierPool();
    }
}
