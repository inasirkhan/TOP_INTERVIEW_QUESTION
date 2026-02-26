package top150.deqode.intuit.day5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapCreation {

//    nput 1 integer array
//{500,100,1000};
//1 string array
//{"TV","Mobile","Fridge"};
//{Mobile=100,TV=500,Fridge=1000}


    public static void main(String[] args) {
        Integer[] prices = {500, 100, 1000};
        String[] products = {"TV", "Mobile","Fridge"};
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i =0;i<prices.length;i++){
            map.put(products[i],prices[i]);
        }

        System.out.println(map);
    }
}
