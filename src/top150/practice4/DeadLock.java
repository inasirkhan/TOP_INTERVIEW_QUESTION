package top150.practice4;

public class DeadLock {

    public static final Object lock1  = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding Lock 1...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1 trying for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1 Holding lock2");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("THREAD 2 HOLDING LOCK 2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                System.out.println("thread 2 trying for lock 1");
                synchronized (lock1) {
                    System.out.println("thread 2 holding lock 1");
                }
            }
        });

        t1.start();
        t2.start();
    }
}


