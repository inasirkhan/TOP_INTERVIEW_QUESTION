package top150.deqode.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InterThreadCommunicationUsingExectuers {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        new Runnable() {
            @Override
            public void run() {

            }
        }
    }
}
