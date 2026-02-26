package top150.deqode.multithreading;

public class InterThreadCommunication {

    public static Boolean StringChance = true;
    public static final Object lock = new Object();

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        String[] arr2 = {"A","B","C"};
        new Thread(()->{
            synchronized (lock){
                for (String str : arr2){
                    if (!StringChance){
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.print(str);
                    StringChance = false;
                    lock.notify();
                }
            }
        }).start();

        new Thread(()->{
           synchronized (lock){
               for (int number : arr1){
                   if (StringChance){
                       try {
                           lock.wait();
                       } catch (InterruptedException e) {
                       }
                   }
                   System.out.print(number);
                   StringChance = true;
                   lock.notify();
               }
           }
        }).start();
    }
}
