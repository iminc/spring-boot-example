package com.blog.utils;

import java.util.UUID;

/**
 * Created by jim on 17-7-8.
 */

/**
 * CommonUtil
 */

public class CommonUtil {

    /**
     * Produce one UUID string
     * @return UUID string
     */
    public static String UUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
