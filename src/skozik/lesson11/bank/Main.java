/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank;

import skozik.lesson11.bank.office.OfficeManager;
import skozik.lesson11.bank.treasury.Treasury;

public class Main {
    public static void main(String[] args) {
        OfficeManager officeManager = new OfficeManager(4);
        Treasury.startJob();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Treasury.stopJob();
        officeManager.stopCashierPool();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
