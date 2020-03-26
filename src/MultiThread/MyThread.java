package MultiThread;

import java.util.Random;

public class MyThread extends Thread {

    private Random random;

    public MyThread(Random random, String name) {
        super(name);
        this.random = random;
    }

    @Override
    public void run() {
        try {

            Thread.sleep(random.nextInt(5000));
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}


