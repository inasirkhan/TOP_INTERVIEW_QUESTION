package top150.deqode.day7;

import java.util.HashMap;

public class MapProductNameWithPrice {

    public static void main(String[] args) {
        int[] productPrice = {500,100,1000};
        String[] productName = {"TV","Mobile","Fridge"};
        HashMap<String, Integer> map = new HashMap<>();

//        map product name with the price
        for (int i=0;i<productPrice.length;i++){
            map.put(productName[i],productPrice[i]);
        }
        System.out.println(map);
    }
}
