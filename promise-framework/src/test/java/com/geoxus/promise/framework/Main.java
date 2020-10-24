package com.geoxus.promise.framework;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        DefaultPromise<Integer> integerDefaultPromise = new DefaultPromise<>();
        DefaultPromise<String> stringDefaultPromise = new DefaultPromise<>();
        integerDefaultPromise.addListener(future -> System.out.println("Result : " + future.get()));

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
                integerDefaultPromise.setSuccess(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
        }).start();

        System.out.println("主线程正常执行");
    }
}
