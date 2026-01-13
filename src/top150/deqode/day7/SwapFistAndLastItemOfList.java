package top150.deqode.day7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapFistAndLastItemOfList {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Nasser", "Mohit", "Jon");
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);
    }
}
