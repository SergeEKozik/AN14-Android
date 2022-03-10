/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.exception;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class MessageCode {
    private static ConcurrentMap<String, String> codeVsMessage = new ConcurrentHashMap<>();

    static {
        codeVsMessage.put("BEM_0001", "Thread execution failed.");
    }

    public static String getMessage(String code) {
        return codeVsMessage.get(code);
    }
}
