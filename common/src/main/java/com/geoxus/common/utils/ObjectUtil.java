package com.geoxus.common.utils;

import java.util.Objects;

/**
 * @author britton
 * @version 1.0
 * @since 2020-10-23
 */
public class ObjectUtil {
    public static <T> T checkNotNull(T arg, String text) {
        if (Objects.isNull(arg)) {
            throw new NullPointerException(text);
        }
        return arg;
    }
}
