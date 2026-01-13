package top150.practice3;

public class ImpetusInterview {

    public static String swapNumber(String str){
        char[] charArray = str.toCharArray();
        reverse(charArray,0,2);
        reverse(charArray,3,5);
        reverse(charArray,6,8);

        return new String(charArray);
    }

    public static void reverse(char[] arr, int start, int end){
        char temp = 0;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private static final Object lock = new Object();
    private static Boolean turnForNum = false;
    public static void main(String[] args) {
        String str = "234567890";
        System.out.println(swapNumber(str));
        char[] L1= {'a','b','c'};
        int[] L2= {1,2,3};


        Thread t1 = new Thread(() -> {
            for (char c : L1) {
                synchronized (lock) {
                    while (turnForNum) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(c);
                    turnForNum = true;
                    lock.notify();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i : L2) {
                synchronized (lock) {
                    while (!turnForNum) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(i+" ");
                    turnForNum = false;
                    lock.notify();
                }
            }
        });

        t1.start();
        t2.start();

    }
}
