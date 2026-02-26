package top150.deqode.intuit.concept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class TreSetExample {

    public <T> void doSome(T data){
        System.out.println(data);
    }

    public <T extends Number> void  doSomething(T data){
        System.out.println(data.doubleValue()* data.doubleValue());
    }
    static class user <T>{

    }

    public static void main(String[] args) {
        TreeSet<StringBuffer> set = new TreeSet<>();
        set.add(new StringBuffer("Nasser"));
        set.add(new StringBuffer("Mohit"));
        set.add(new StringBuffer("Arpit"));

        System.out.println(set);

        HashMap<Object, Object> map = new HashMap<>();
    }
}
