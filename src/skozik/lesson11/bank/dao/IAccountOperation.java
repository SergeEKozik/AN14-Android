/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.dao;

import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.transaction.ClientTransactionResult;

public interface IAccountOperation {
    ClientTransactionResult execute() throws BankException;
}
