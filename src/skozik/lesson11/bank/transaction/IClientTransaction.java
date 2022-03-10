/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.transaction;

import skozik.lesson11.bank.exception.BankException;
import skozik.lesson11.bank.office.OfficeManager;

public interface IClientTransaction {
    ClientTransactionResult getResult() throws BankException;
    void putResult(ClientTransactionResult result) throws BankException;
    void dispatch(OfficeManager officeManager) throws BankException;
    ClientTransactionType getType();
}
