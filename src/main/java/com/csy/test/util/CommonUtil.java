package com.csy.test.util;

import java.util.UUID;

public class CommonUtil {
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        //去掉“-”符号
        return uuid.replaceAll("-", "");
    }
}
