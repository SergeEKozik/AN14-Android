/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.userinterface;

public interface IRenderer {
    void printMessage(String clientId, String transactionType, String transactionResult);
}
