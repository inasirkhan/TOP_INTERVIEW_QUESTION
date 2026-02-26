package top150.deqode.intuit.concept;

import java.util.*;

public class IteratorEx {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Nasser","Mohit","Rohit","Udit"));
        Iterator<String> iterator =  list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equalsIgnoreCase("Mohit")){
                iterator.remove();
            }
        }
        System.out.println(list);

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String next = listIterator.next();
            if (next.equalsIgnoreCase("Nasser")){
                listIterator.add("Zoya");
            }
            if (next.equalsIgnoreCase("Rohit")){
                listIterator.remove();
            }
            if (next.equalsIgnoreCase("Udit")){
                listIterator.set("Chandwani");
            }
        }

        System.out.println(list);
    }
}
