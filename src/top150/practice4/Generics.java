package top150.practice4;

public class Generics {

    public static  <T>  void printNumber(T[] numbers){
        for(T num : numbers){
            System.out.println(num);
        }
    }

    public static <T extends Number> double add(T a, T b){
         return a.doubleValue()* b.doubleValue();
    }

    record  myUser (int id, String name){};

    public static void main(String[] args) {
        Integer[] arr = {4,6,2,5,1};
        printNumber(arr); // not work with primitive types
        add(3,5);
        add(5.4,3.9);
    }
}
