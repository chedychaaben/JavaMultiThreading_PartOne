package ex1;

import java.util.concurrent.Semaphore;

public class Examin {
    // Shared semaphore to ensure mutual exclusion
    static Semaphore mutex = new Semaphore(1);  // Ensuring only one thread can access at a time

    public static void main(String[] args) {
        // Create and start the threads
        A1 a1 = new A1();
        A2 a2 = new A2();
        A3 a3 = new A3();

        a1.start();
        a2.start();
        a3.start();
    }
}