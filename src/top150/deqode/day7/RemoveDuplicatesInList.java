package top150.deqode.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveDuplicatesInList {

    public static List<Integer> removeDuplicates(List<Integer> list){
        Collections.sort(list);
        int n = list.size();
        int j= 1;
        for (int i=1;i<n;i++){
            if (!Objects.equals(list.get(i), list.get(i - 1))){
                list.set(j,list.get(i));
                j++;
            }
        }
        return list.subList(0,j);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,5,2,2,11,45,3,5,4,1,11);
        System.out.println(removeDuplicates(list));
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }
}
