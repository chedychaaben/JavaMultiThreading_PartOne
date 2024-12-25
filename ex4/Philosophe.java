package ex4;

public class Philosophe extends Thread {
    private final int i; 

    public Philosophe(int i) {
        this.i = i;  
    }

    public void run() {
        while (true) {
            Prendre_fourchette(this.i);
            manger();
            poser_fourchette(this.i);
        }
    }

    public void Prendre_fourchette(int i) {
        try {
            int leftFork = i; 
            int rightFork = (i + 1) % Tour.N; 
                Tour.Sem_fourchettes[leftFork].acquire(); 
                Tour.Sem_fourchettes[rightFork].acquire();
            System.out.println("Philosophe " + (i + 1) + " prend les fourchettes " + leftFork + " et " + rightFork);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            e.printStackTrace();
        }
    }

    public void manger() {
        try {
            Thread.sleep((int) (Math.random() * 1000)); 
            System.out.println("Philosophe " + (this.i + 1) + " mange");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); 
            e.printStackTrace();
        }
    }

    public void poser_fourchette(int i) {
        int leftFork = i; 
        int rightFork = (i + 1) % Tour.N; 
        Tour.Sem_fourchettes[leftFork].release(); 
        Tour.Sem_fourchettes[rightFork].release(); 
        System.out.println("Philosophe " + (i + 1) + " pose les fourchettes " + leftFork + " et " + rightFork);  
    }
}
