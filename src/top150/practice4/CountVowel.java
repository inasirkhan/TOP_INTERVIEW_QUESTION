package top150.practice4;

public class CountVowel {

    public static boolean isVowel(char ch){
        char c = Character.toLowerCase(ch);
        return (c == 'a' || c=='e' || c=='i' || c=='o' || c=='u');
    }

    public static int countVowel(String str , int index ){
        if(index == str.length())
            return 0;

        char current = str.charAt(index);
        int count = isVowel(current)?1:0;
        return count+ countVowel(str, index+1);
    }

    class Print {
        int num = 1;
        synchronized void printOdd() throws Exception {
            while (num <= 10) {
                if (num % 2 == 0) wait();
                System.out.println("Odd: " + num++);
                notify();
            }
        }
        synchronized void printEven() throws Exception {
            while (num <= 10) {
                if (num % 2 != 0) wait();
                System.out.println("Even: " + num++);
                notify();
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABeadifi";
        System.out.println(countVowel(str,0));


    }
}
