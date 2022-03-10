/*
 * Copyright (c) 2022. Serge Kozik to Present
 * mailto: sergekozik84@gmail.com
 * All rights reserved.
 */

package skozik.lesson11.bank.dao;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockChannel {
    private String name;
    private ConcurrentMap<String, Lock> locks;

    public LockChannel(String name) {
        this.name = name;
        this.locks = new ConcurrentHashMap<>();
    }

    public Lock getLock(String lockId) {
        Lock result = null;
        result = locks.computeIfAbsent(lockId, id -> new ReentrantLock());
        return result;
    }
}
