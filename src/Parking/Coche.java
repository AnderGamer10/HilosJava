package Parking;
public class Coche extends Thread{
    Parking parking;
    int numCoche;
    public Coche (int numCoche, Parking parking){
        this.numCoche = numCoche;
        this.parking = parking;
    }

    @Override
    public void run() {
        try {
            parking.anadirCoche(numCoche);
            sleep((long) (Math.random()*10+5)*1000);
            parking.eliminarCoche(numCoche);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}