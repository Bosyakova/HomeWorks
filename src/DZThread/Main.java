package DZThread;

public class Main {
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread thread = new ExampleThread();
        System.out.println(thread.getState());
        thread.start();
        try {
            Thread.sleep(300);
            synchronized (lock) {
                System.out.println(thread.getState());
                lock.notifyAll();
            }
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());

    }

    static class ExampleThread extends Thread {
        @Override
        public void run() {
            System.out.println(getState());
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

