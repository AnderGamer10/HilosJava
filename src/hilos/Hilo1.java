package hilos;

public class Hilo1 extends Thread {
    public Hilo1(){

    }
    @Override
    public void run() {
        while (true){
            System.out.println("************************************Aca estamo primer hilo");
        }
    }

}
