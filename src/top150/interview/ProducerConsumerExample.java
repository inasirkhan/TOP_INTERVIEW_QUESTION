package top150.interview;


import java.util.*;

class Product {
    int element = 0;
    private boolean producerChance = true;

    public boolean isProducerChance() {
        return producerChance;
    }

    public synchronized void produce() throws InterruptedException {
        if (!this.isProducerChance()) {
            wait();
        }
        int count = 0;
        if (this.element == 0) {
            this.element =1;
            count++;
            System.out.println(Thread.currentThread().getName() + " produced " + count);
            producerChance = false;
            notify();
        }
    }

    public synchronized void consume() throws InterruptedException {
        if (this.isProducerChance()) {
            wait();
        }
            int count = 0;
            if (this.element == 1) {
                this.element = 0;
                count++;
                System.out.println(Thread.currentThread().getName() + " consumed " + count);
            }

            producerChance = true;
            notify();
        }

}

class Producer implements Runnable {

    private Product product;

    public Producer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                product.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

class Consumer implements Runnable {

    private Product product;

    public Consumer(Product product) {
        this.product = product;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            try {
                product.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static <T extends Number> void addTwoNum(T a, T b){

    }

}

public class ProducerConsumerExample {

    public static void main(String[] args) {
        Product product = new Product();
        Producer producer = new Producer(product);
        Consumer consumer = new Consumer(product);
        ArrayDeque<Object> objects = new ArrayDeque<>();
        Queue<Object> queue = new LinkedList<>();
        HashSet<Object> objects1 = new HashSet<>();
        objects1.add(null);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("Naaser","asdf");
        objectObjectHashMap.values();

        Thread thread = new Thread(producer);
        thread.setName("Producer");
        Thread thread2 = new Thread(consumer);
        thread2.setName("Consumer");

        thread.start();
        thread2.start();
    }
}

