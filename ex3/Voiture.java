package ex3;
public class Voiture extends Thread{
    static void passerV(){
        try {
            Pont.expont.acquire();
            System.out.println("Arrivage d'une Voiture");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Pont.expont.release();
            System.out.println("Voiture Passeé");
        }
    }
    public void run() {
        passerV();
}
}
