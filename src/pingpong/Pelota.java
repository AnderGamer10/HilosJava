package pingpong;

public class Pelota {
//    TODO: Version como contador
    String ladoPelota = "";
    Object lock1 = new Object();
    public void ladoPing(String jugador){
        synchronized(lock1) {
            while (ladoPelota.equals("Ping")){
                try {
                    lock1.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread Interrupted");
                }
            }
            ladoPelota = "Ping";
            System.out.println(jugador + " Lado " + ladoPelota);
            lock1.notifyAll();
        }
    }
    public void ladoPong(String jugador){
        synchronized(lock1) {
            while (ladoPelota.equals("Pong")){
                try {
                    lock1.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread Interrupted");
                }
            }
            ladoPelota = "Pong";
            System.out.println(jugador + " Lado " + ladoPelota);
            lock1.notifyAll();
        }
    }

}
