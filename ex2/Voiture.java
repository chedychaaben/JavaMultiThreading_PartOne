package ex2;

public class Voiture extends Thread{
    static void passerV(){
        try {
            Pont.expont.acquire();
            System.out.println("Passage d'une Voiture");
            Pont.nbVoitures++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            Pont.expont.release();
            System.out.println("Voiture Passeé");
            Pont.nbVoitures--;
        }
    }
    public void run() {
        passerV();
}
}
