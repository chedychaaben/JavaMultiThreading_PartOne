package ex1;

public class A3 extends Thread{
    public void run() {
        try {
            Examin.mutex.acquire();  // Acquire the semaphore
            System.out.println("A3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Examin.mutex.release();  // Release the semaphore
        }
    }

}