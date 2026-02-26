package top150.interview.interview2;

import java.util.*;
import java.util.stream.Stream;

public class PersistenceL2RSheikh {

    public static void main(String[] args) {
        List<Integer> intergerList = new ArrayList<>();
        intergerList.add(1); // 0
        intergerList.add(2); // 1
        intergerList.add(3); // 2
        intergerList.add(4); //3
        intergerList.add(5); //4
        intergerList.remove(3);
        intergerList.add(3);
        intergerList.add(3, 3);

        System.out.println(intergerList); //[1, 2, 3, 5, 3]

        Map<String, String> myMap = new HashMap<>();
        myMap.put("Key1", "Value1");
        myMap.put("Key2", "Value2");
        myMap.put("Key3", "Value3");

        Iterator<String> iterator = myMap.keySet().iterator();

//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            if (key.equals("Key2")) {
//                myMap.remove(key);
//            }
//               output -> ConcurrentModification Exception
//    }

        String[] strArray = {"java", "spring","microservices", "angular",null,"react"};
        String s = Arrays.stream(strArray).filter(str -> !Objects.isNull(str)).max(Comparator.comparing(String::length)).get();
        String s1 = Arrays.stream(strArray).filter(str-> str != null).max(Comparator.comparing(String::length)).get();
        System.out.println(s);
        System.out.println(s1);

        System.out.println(Objects.nonNull(null));

//        strArray.forEach(System.out::println) array don't have any inbuild foreach method
//        Arrays.stream(strArray).forEach(System.out::printf); // null pointer exception

        Stream<String> stringStream = Arrays.stream(strArray).filter(st -> !Objects.isNull(st));
        stringStream.forEach(st-> System.out.print(st+" "));
        stringStream.forEach(st-> System.out.print(st+" ")); // stream already consumed, will through exception
    }
}
