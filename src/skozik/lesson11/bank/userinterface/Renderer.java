/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.userinterface;

import static skozik.lesson11.bank.BankConstants.CLIENT_TRANSACTION_REPORT_FORMAT;

public class Renderer {
    public static void printMessage(String clientId, String transactionType, String transactionResult) {
        System.out.printf(CLIENT_TRANSACTION_REPORT_FORMAT, clientId, transactionType, transactionResult);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }
}
