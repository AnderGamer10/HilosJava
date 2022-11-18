package Semaforo;

public class Parking {
    Semaforo semaforo = new Semaforo(5);
    Lock lock = new Lock();
    int plazasLibres = 5;
    public void entrar(int numCoche) throws InterruptedException {
        semaforo.recoger();
        lock.recoger();
        plazasLibres--;
        System.out.println("Entro el coche " + numCoche);
        lock.liberar();
    }
    public void salir(int numCoche) throws InterruptedException {
        lock.recoger();
        plazasLibres++;
        lock.liberar();
        System.out.println("Salio el coche " + numCoche);
        semaforo.liberar();
    }
}
