/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.office;
import skozik.lesson11.bank.transaction.IClientTransaction;

public class CashierTask implements Runnable {
    private OfficeManager officeManager;
    private boolean isActive;

    public CashierTask(OfficeManager officeManager) {
        this.officeManager = officeManager;
        this.isActive = true;
    }

    @Override
    public void run() {
        while (this.isActive) {
            try {
                IClientTransaction clientTransaction = officeManager.getClientTask();
                if (clientTransaction != null) {
                    clientTransaction.putResult(
                        CashierCommandFactory.getCommand(clientTransaction.getType())
                            .apply(clientTransaction));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
