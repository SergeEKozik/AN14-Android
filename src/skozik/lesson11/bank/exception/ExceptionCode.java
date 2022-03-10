/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.exception;

public enum ExceptionCode {
    BEM_0001("Failed to dispatch client transaction to queue."),
    BEM_0002("Failed to take client transaction from queue."),
    BEM_0003("Failed to obtain result of client transaction from queue."),
    BEM_0004("Account does not exist."),
    BEM_0005("Currency does not exist."),
    BEM_0006("Not enough money to withdraw.");

    private String msg;

    ExceptionCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
