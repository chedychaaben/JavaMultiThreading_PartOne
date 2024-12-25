package ex4;

import java.util.concurrent.Semaphore;

public class Tour {
    static final int N = 5; 
    static Semaphore[] Sem_fourchettes = new Semaphore[N]; 

    public static void main(String[] args) {
        for (int i = 0; i < N; i++) {
            Sem_fourchettes[i] = new Semaphore(1); 
        }
        for (int i = 0; i < N-1; i++) {
            Philosophe p = new Philosophe(i); 
            p.start();
        }
    }
}
