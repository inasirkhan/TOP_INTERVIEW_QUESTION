package top150.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListLength {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Nasser", "Mohit", "Udit","Mohammed","Roy");
//      sort based on the length
        list.sort(Comparator.comparing(s->s.length()));
        System.out.println(list);

//      descending order based on the length
//        list.sort(Comparator.comparingInt(String::length).reversed());
        List<String> list1 = list.stream().sorted(Comparator.comparing(String::length).reversed()).toList();
        System.out.println(list1);
//        System.out.println(list);

    }
}
