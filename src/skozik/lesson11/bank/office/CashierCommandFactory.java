/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.office;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

import skozik.lesson11.bank.dao.AccountDaoAdapter;
import skozik.lesson11.bank.transaction.ClientTransactionDeposit;
import skozik.lesson11.bank.transaction.ClientTransactionResult;
import skozik.lesson11.bank.transaction.ClientTransactionType;
import skozik.lesson11.bank.transaction.ClientTransactionWithdraw;
import skozik.lesson11.bank.transaction.IClientTransaction;

public class CashierCommandFactory {
    private static ConcurrentMap<ClientTransactionType, Function<IClientTransaction, ClientTransactionResult>> commands
        = new ConcurrentHashMap<>();
    static {
        commands.put(ClientTransactionType.WITHDRAW, (transaction) ->
            AccountDaoAdapter.withdraw((ClientTransactionWithdraw) transaction));

        commands.put(ClientTransactionType.DEPOSIT, (transaction) ->
            AccountDaoAdapter.deposit((ClientTransactionDeposit) transaction));
    }

    public static Function<IClientTransaction, ClientTransactionResult> getCommand(ClientTransactionType type) {
        return commands.get(type);
    }
}
