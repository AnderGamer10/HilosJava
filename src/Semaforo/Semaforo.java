package Semaforo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Semaforo {
    int cantMax;
    int contador = 0;
    public Semaforo(int cantMax) {
        this.cantMax = cantMax;
    }

    public void recoger() throws InterruptedException {
        synchronized (this){
            while (contador >= cantMax){
                wait();
            }
            contador++;
            notifyAll();
        }
    }

    public void liberar() throws InterruptedException {
        synchronized (this){
            while (contador <= 0){
                wait();
            }
            contador--;
            notifyAll();
        }

    }
}
