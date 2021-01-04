package com.grinner.xiaomishu.user;

import java.util.HashMap;
import java.util.Map;

public class UserConstant {
    public static final String AT_ALL = "@all";

    private static Map<String, String> mobiles;


    static {
        mobiles = new HashMap<>();
        mobiles.put("张三","15533533533");
    }

    public static String getMobile(String userName) {
        return mobiles.get(userName);
    }
}
