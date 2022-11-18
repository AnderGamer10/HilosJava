package Semaforo;
public class Coche extends Thread{
    Parking parking;
    int numCoche;
    public Coche(int numCoche, Parking parking){
        this.numCoche = numCoche;
        this.parking = parking;
    }

    @Override
    public void run() {
        try {
            parking.entrar(numCoche);
            sleep(1000);
            parking.salir(numCoche);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}