package top150.deqode.multithreading;

import kotlin.jvm.Synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterThreadCommunicationUsingExecutors {

    public static final Object lock = new Object();
    public static Boolean stringChance = true;

    public static void main(String[] args) {
        String[] str = {"A","B","C"};
        Integer[] nums = {1,2,3};
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int num : nums) {
                    synchronized (lock) {
                        if (stringChance) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        System.out.print(num);
                        stringChance = true;
                        lock.notify();
                    }
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (String str : str) {
                    synchronized (lock) {
                        if (!stringChance) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                            }
                        }
                        System.out.print(str);
                        stringChance = false;
                        lock.notify();
                    }
                }
            }
        };
        executorService.execute(runnable1);
        executorService.execute(runnable2);
    }
}
