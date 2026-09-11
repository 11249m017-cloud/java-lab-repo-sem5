class Counter extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);

            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TaskManager {
    public static void main(String[] args) {

        Counter c = new Counter();
        c.start();
    }
}