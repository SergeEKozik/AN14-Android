/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank;

import java.math.BigDecimal;

public interface BankConstants {
    String STATUS_ERROR = "error";
    String STATUS_OK = "ok";
    String WITHDRAW_REPORT_FORMAT = "Account %s withdraw %s";
    String DEPOSIT_REPORT_FORMAT = "Account %s deposit %s";
    String NOT_IMPLEMENTED_REPORT_FORMAT = "Operation %s is not implemented";
    int TREASURY_CHECK_JOB_PERIOD_SEC = 1;
    BigDecimal CURRENCY_TALENT_MAX_TREASURY_LIMIT = new BigDecimal(100);
    BigDecimal CURRENCY_TALENT_MIN_TREASURY_LIMIT = new BigDecimal(100);
    BigDecimal CURRENCY_TALENT_TRANCHE_TREASURY = new BigDecimal(50);
}
