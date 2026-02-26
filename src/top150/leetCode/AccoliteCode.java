package top150.leetCode;


import java.util.*;

public class AccoliteCode {

    public static void main(String[] args) {
//        1
        byte s= 127;
        s++;
        s++;
        System.out.println(s);
//        2
        short x = 10;
//        x = x*5 compile time error
        x = (short) ( x * 5);


//3
        String c = "Hello i love java";
        boolean b ;
        b = c.startsWith("hello");
        System.out.println(b);
//        4
        String[] arr = {"RAM","20","30","40","VIRAT","100","50","10"};
//      return student with the highest average VIRAT 53;

        String topStudent = null;
        String currentStudent = null;
        int topAvg = 0;
        int count = 0;
        int total = 0;
        for(String str : arr){
//          is numeric
            if (!str.matches("\\d+")){

                if (currentStudent!=null){
                    int avg = total / count;
                    if (avg>topAvg){
                        topAvg = avg;
                        topStudent = currentStudent;
                    }
                }
                currentStudent = str;
                count = 0;
                total = 0;

            }
            else {
                total+=Integer.parseInt(str);
                count++;
            }

        }
        //calculating last student
        int avg = total/count;
        if (avg> topAvg){
            topAvg = avg;
            topStudent = currentStudent;
        }

        System.out.println("top student : "+topStudent+" with avg : "+topAvg);

//        5
        try{
            int a = 1;
            int d = 10/a;
            try{
                if(a == 1){
                    a =  a/0;
//                    it's like (a/a)-a division happen first
//                    a = a/0; if exception come inner finally run first then outer catch
                }
            }
            finally {
                System.out.println("A");
            }
        } catch (Exception e) {
            System.out.println("B");
        }

//        6
        char[] charss = {'A','1','b',' ','a','0'};
//        char[] charss2 = {'A',1,'b',' ','a','0'}; diffrent one is not character
        for (int i=0;i<5;++i){
            i++;
            if(Character.isDigit(charss[i]))
                System.out.println(charss[i]+" is a digit");
            if(Character.isWhitespace(charss[i]))
                System.out.println(charss[i]+" is a whitespace");
            if(Character.isUpperCase(charss[i]))
                System.out.println(charss[i]+" is a uppercase");
            if(Character.isLowerCase(charss[i]))
                System.out.println(charss[i]+" is a lowercase");
            i++;
        }

//        7

        LinkedList<Integer> list  = new LinkedList<>();
        list.add(4);
        list.add(8);
        list.add(1);
        Iterator<Integer> iterator = list.iterator();
        Collections.reverse(list);
        Collections.sort(list);
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" : ");
        }
    }
}
