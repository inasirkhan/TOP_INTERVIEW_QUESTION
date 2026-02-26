package top150.deqode.intuit.day5;

import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class MapCodePersistence {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        List<Map<String,String>> list = Arrays.asList(Map.of("pipe","1","status","Running")
                ,Map.of("pipe","2","status","Running"),
                Map.of("pipe","3","status","Failed"));

//        o/p - ["Running" : 2, "Failed" : 1] using stream
        Map<String, Long> status = list.stream().collect(Collectors.groupingBy(map ->
                map.get("status"), Collectors.counting()
        ));


        System.out.println(status);

        new Thread(()->{
            System.out.println(" thread working");
        }).start();

        Runnable runnable = ()->{
            System.out.println("runnable working");
        };

        new Thread(runnable).start();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(runnable);

        new Thread(()->{
           synchronized (lock1){
               synchronized (lock2){

               }
           }
        }).start();

        new Thread(()->{
           synchronized (lock2){
               synchronized (lock1){

               }
           }
        }).start();

        List<Integer> list2 = Arrays.asList(2,4,5,2,5,1);
        list2.stream().distinct().forEach(s-> System.out.print(s+" "));
        List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 2, 4), Arrays.asList(5, 6, 7));
        System.out.println(list1);

        List<Integer> list3 = list1.stream().flatMap(l -> l.stream()).toList();
        System.out.println(list3);

        List<String> list4 = Arrays.asList("nasser", "mohit", "rohit", "hardeep");
        Optional<String> first = list4.stream().max(Comparator.comparing(String::length));


    }
}
