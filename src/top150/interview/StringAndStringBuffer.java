package top150.interview;


public class StringAndStringBuffer {

//    OBJECT CLASS EQUALS METHOD BY DEFAULT DO REFERENCE COMPARISON
//    STRING CLASS EQUALS METHOD BY DEFAULT DO CONTENT COMPARISON
//    STRING BUILDER CLASS EQUALS METHOD NOT OVERRIDE SO OBJECT EQUALS METHOD WILL BE CALLED

    public static void main(String[] args) {
        String s1 = new String("ABC");
        StringBuffer s2 = new StringBuffer("ABC");
        StringBuffer s3 = new StringBuffer("ABC");
        String s4 = new String("ABC");
        String s5 = "ABC";
        String s6 = "ABC";

        System.out.println(s1.equals(s2));
//   BECAUSE OBJECTS ARE OF DIFFERENT TYPE SO NO CONTENT COMPARISON

        System.out.println(s2.equals(s3));
//        FALSE BECUASE REFERENCE COMPARISON
        System.out.println(s1 == s4);
//   BECAUSE BOTH OBJECT POINTING TO DIFFERENT MEMORY LOCATIONS

//     System.out.println(s1 == s2);
//   INCOMPARABLE TYPES

        System.out.println(s1 == s5);
        System.out.println(s5 == s6);
//    COMPARISON BASED ON AVAILABILITY IN CONSTANT POOL

        String nass = new String("Nass");
        String nass2 = "Nass";
        String nass3 = "Nass";
        System.out.println(nass == nass2);
        System.out.println(nass2 == nass3);
        System.out.println(nass.equals(nass2));

    }
}
