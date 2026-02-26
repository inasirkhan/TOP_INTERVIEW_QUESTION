package top150.deqode.multithreading;

public class JoinUseCase {

    public static Integer num = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i <500; i++) {
                num++;
            }
        });

        thread.start();
        thread.join();

        System.out.println(num);
    }
}
