package top150.deqode.intuit.day5;

import java.util.*;
import java.util.stream.Collectors;

class emp {

    int id;
    String name;

    emp(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<emp> empList = Arrays.asList(new emp(101,"nasser"),new emp(101,"nasser"));
        System.out.println(empList.size());

        Map<Integer, List<emp>> collect = empList.stream().collect(Collectors.groupingBy(emp -> emp.id));
        Collection<List<emp>> values = collect.values();
        System.out.println(values);
        System.out.println(empList.size());

        HashMap<Integer, top150.deqode.intuit.day5.emp> emp = new HashMap<>();
        for (emp e : empList){
            emp.put(e.id, e);
        }
        System.out.println(emp);
    }
}
