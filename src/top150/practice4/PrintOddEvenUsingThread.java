package top150.practice4;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintOddEvenUsingThread {

    public static final Object lock = new Object();
    public static  boolean oddTurn = false;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable runnable = ()->{
            System.out.println("working 1");
        };

        Runnable runnable1 = ()->{
            System.out.println("working 2");
        };

        executorService.execute(runnable);
        executorService.execute(runnable1);
        executorService.shutdown();



        Thread t1 = new Thread(() -> {
            for (int i=1;i<10;i++){
                synchronized (lock){
                    if (oddTurn) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (i%2==0){
                        System.out.println("EVEN "+i);
                    }
                    oddTurn = true;
                    lock.notify();

                }
            }
//            IntStream.rangeClosed(1, 10).filter(n -> n % 2 == 0).forEach(n-> System.out.println("EVEN "+n));
        });

        Thread t2 = new Thread(() -> {
            for (int i =0;i<10;i++){
                synchronized (lock){
                    while (!oddTurn){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if (i%2!=0){
                        System.out.println("Odd "+i);
                    }
                    oddTurn = false;
                    lock.notify();
                }
            }
//            IntStream.rangeClosed(1, 10).filter(n -> n % 2 != 0).forEach(n-> System.out.println("ODD "+n));
        });

        t1.start();
        t2.start();

        new Thread(()->{
            for (int i=0;i<10;i++){
                synchronized (lock){
                    while (oddTurn){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        System.out.println("Even "+i);
                        oddTurn = true;
                        lock.notify();
                    }
                }
            }
        });
    }
}
