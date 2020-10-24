package com.geoxus.common.utils;

/**
 * @author britton
 * @version 1.0
 * @since 2020-10-23
 */
public class ThrowableUtil {
    private ThrowableUtil() {
    }

    /**
     * 提供了自动创建Throwable的方法
     */
    public static <E extends Throwable> E unknownStackTrace(E cause, Class<?> clazz, String method) {
        cause.setStackTrace(new StackTraceElement[]{new StackTraceElement(clazz.getName(), method, null, -1)});
        return cause;
    }

    public static void throwRuntimeException(Throwable t) {
        throw (RuntimeException) t;
    }
}
