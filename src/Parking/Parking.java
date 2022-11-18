package Parking;

import static java.lang.Thread.sleep;

public class Parking {
    int cochesActuales = 0;
    public void anadirCoche(int numCoche) throws InterruptedException {
        synchronized (this){
            while (cochesActuales >= 5){
                wait();
            }
            cochesActuales++;
            System.out.println("Coche numero " + numCoche + " ha sido añadido");
            notifyAll();
        }
    }
    public void eliminarCoche(int numCoche) throws InterruptedException {
        synchronized (this){
            while (cochesActuales <= 0){
                wait();
            }
            cochesActuales--;
            System.out.println("Coche numero " + numCoche + " ha sido eliminado");
            notifyAll();
        }
    }

}

