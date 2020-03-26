package MultiThread;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        Random random = new Random();
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new MyThread(random, "Thread" + i);
        }

        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Threads are ended");
    }
}
