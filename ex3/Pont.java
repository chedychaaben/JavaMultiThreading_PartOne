package ex3;

import java.util.concurrent.Semaphore;

public class Pont {
    static int N=5;
    static Semaphore expont = new Semaphore(N);



    public static void main(String[] args) {
            Voiture v1 = new Voiture();
            Voiture v2 = new Voiture();
            Voiture v3 = new Voiture();
            Voiture v4 = new Voiture();
            Voiture v5 = new Voiture();
            Camion c1 = new Camion();
            Camion c2 = new Camion();
            Camion c3 = new Camion();
            Camion c4 = new Camion();
            Camion c5 = new Camion();
            v1.start();
            v2.start();
            c1.start();
            c2.start();
            v3.start();
            v4.start();
            c3.start();
            c4.start();
            v5.start();
            c5.start();
    }
}
