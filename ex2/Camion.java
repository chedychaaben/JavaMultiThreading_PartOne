package ex2;

public class Camion extends Thread{
    static void passerC(){
        try {
            Pont.expont.acquire(3);
            Pont.nbCamions++;
            System.out.println("arrivage d'un Camion");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Pont.nbCamions--;
            Pont.expont.release(3);
            System.out.println("Camion Passeé");
        }
    }
    public void run() {
        passerC();
}
}
