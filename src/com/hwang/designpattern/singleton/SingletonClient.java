package com.hwang.designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试单例模式的类
 */

public class SingletonClient {
     public static void main(String[] args) throws InterruptedException {
         int threadNum = 10; // 线程数
         CountDownLatch countDownLatch = new CountDownLatch(threadNum);
         long startTime = System.currentTimeMillis();// 开始时间
         for (int j = 0; j < threadNum; j++) {
             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     for (int i = 0; i < 1000000; i++) {
                         SingletonHungry.getInstance();
                     }

                     countDownLatch.countDown();
                 }
             }).start();
         }

         countDownLatch.await(); // main 线程阻塞，直到计数变为0，才会继续往下执行
         long endTime =  System.currentTimeMillis();
         System.out.println("饿汉式耗时时间为：" + (endTime - startTime));

         CountDownLatch countDownLatch1 = new CountDownLatch(threadNum);
         long startTime1 = System.currentTimeMillis();// 开始时间
         for (int j = 0; j < threadNum; j++) {
             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     for (int i = 0; i < 1000000; i++) {
                         SingletonLazy.getInstance();
                     }

                     countDownLatch1.countDown();
                 }
             }).start();
         }

         countDownLatch1.await(); // main 线程阻塞，直到计数变为0，才会继续往下执行
         long endTime1 =  System.currentTimeMillis();
         System.out.println("懒汉式耗时时间为：" + (endTime1 - startTime1));

         CountDownLatch countDownLatch2 = new CountDownLatch(threadNum);
         long startTime2 = System.currentTimeMillis();// 开始时间
         for (int j = 0; j < threadNum; j++) {
             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     for (int i = 0; i < 1000000; i++) {
                         SingletonDoubleLock.getInstance();
                     }

                     countDownLatch2.countDown();
                 }
             }).start();
         }

         countDownLatch2.await(); // main 线程阻塞，直到计数变为0，才会继续往下执行
         long endTime2 =  System.currentTimeMillis();
         System.out.println("双重锁式耗时时间为：" + (endTime2 - startTime2));

         CountDownLatch countDownLatch3 = new CountDownLatch(threadNum);
         long startTime3 = System.currentTimeMillis();// 开始时间
         for (int j = 0; j < threadNum; j++) {
             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     for (int i = 0; i < 1000000; i++) {
                         SingletonStatic.getInstance();
                     }

                     countDownLatch3.countDown();
                 }
             }).start();
         }

         countDownLatch3.await(); // main 线程阻塞，直到计数变为0，才会继续往下执行
         long endTime3 =  System.currentTimeMillis();
         System.out.println("内部静态类式耗时时间为：" + (endTime3 - startTime3));
     }
}
