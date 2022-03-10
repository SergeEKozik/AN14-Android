/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.common;

import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicReference;

public class BankUtil {

    public static void getAndAddAtomicReference(AtomicReference<BigDecimal> currentAmount, BigDecimal augend) {
        while (true) {
            BigDecimal oldVal = currentAmount.get();
            if (currentAmount.compareAndSet(oldVal, oldVal.add(augend)))
                return;
        }
    }

    public static void getAndSubtractAtomicReference(AtomicReference<BigDecimal> currentAmount, BigDecimal subtrahend) {
        while (true) {
            BigDecimal oldVal = currentAmount.get();
            if (currentAmount.compareAndSet(oldVal, oldVal.subtract(subtrahend)))
                return;
        }
    }
}
