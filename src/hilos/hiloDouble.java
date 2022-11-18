package hilos;

public class hiloDouble extends Thread{
    String textito;
    public hiloDouble(String s){
        this.textito = s;
    }
    @Override
    public void run() {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("EXIT************** " + textito + " TERMINADO");
    }
}
