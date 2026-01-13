package top150.arraystrings;

import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {

        int ans =0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i=0;i<s.length();i++){
            Integer first = map.get(s.charAt(i));
            Integer second;

            if (i+1<s.length()){
                second =  map.get(s.charAt(i + 1));
                if (first<second){
                    ans+=second-first;
                    i++; // cause second element calculation is done
                } else{
                    ans+=first;
                }
            }
            else {
            ans+=first; //insert last element
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String num = "III";
        String  num2 = "LVIII";
        String  num3 = "MCMXCIV";
        System.out.println("ROMAN TO INT CONVERSION OF NUMBER "+num+" IS : "+romanToInt(num));
        System.out.println("ROMAN TO INT CONVERSION OF NUMBER "+num2+" IS : "+romanToInt(num2));
        System.out.println("ROMAN TO INT CONVERSION OF NUMBER "+num3+" IS : "+romanToInt(num3));
    }
}
