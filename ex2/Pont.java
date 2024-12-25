package ex2;
import java.util.concurrent.Semaphore;

public class Pont {
    static int nbVoitures = 0;
    static int nbCamions = 0;
    static Semaphore expont = new Semaphore(3);

    public static void detail() {
        System.out.println("Nombre de Voitures : " + nbVoitures);
        System.out.println("Nombre de Camions : " + nbCamions);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Voiture().start();
            Pont.detail();
            new Camion().start();
            Pont.detail();
        }
    }
}