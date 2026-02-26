package top150.deqode.multithreading;

import java.util.concurrent.CompletableFuture;

public class CompatebleFutureEx {

    public static String serviceA(){
        System.out.println("service a task executing");
        return "done service a";
    }

    public static int serviceB(){
        System.out.println("Service b task executing");
        return 0;
    }
    public static void main(String[] args) {

//        parallel api calls
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(CompatebleFutureEx::serviceA);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(CompatebleFutureEx::serviceB);

        CompletableFuture.allOf(f1, f2);
    }
}
