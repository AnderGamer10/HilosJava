package Semaforo;

public class Lock {
    int contador = 0;
    public void recoger() throws InterruptedException {
        synchronized (this){
            while (contador >= 1){
                wait();
            }
            contador++;
            notifyAll();
        }
    }

    public void liberar() throws InterruptedException {
        synchronized (this) {
            while (contador <= 0){
                wait();
            }
            contador--;
            notifyAll();
        }
    }
}
