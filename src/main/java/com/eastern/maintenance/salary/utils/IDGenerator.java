package com.eastern.maintenance.salary.utils;

import java.util.UUID;

/**
 * 数据库表字段自增
 */
public class IDGenerator {
    public static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}
