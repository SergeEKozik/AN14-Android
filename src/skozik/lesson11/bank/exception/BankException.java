/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.exception;

public class BankException extends Exception {

    public BankException(ExceptionCode code, Throwable cause) {
        super(code.getMsg(), cause);
    }

    public BankException(ExceptionCode code) {
        super(code.getMsg());
    }

    public BankException(ExceptionCode code, String message) {
        super(code.getMsg() + message);
    }
}
