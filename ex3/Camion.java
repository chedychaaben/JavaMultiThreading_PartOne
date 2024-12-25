package ex3;

public class Camion extends Thread{
    static void passerC(){
        try {
            Pont.expont.acquire();
            System.out.println("arrivage d'un Camion");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Pont.expont.release();
            System.out.println("Camion Passeé");
        }
    }
    public void run() {
        passerC();
}
}

