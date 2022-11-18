package hilos;

public class hiloConInterfaz implements Runnable{
    String nombre;
    public hiloConInterfaz(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run() {
        System.out.println("Cositas con " + nombre);

    }
}
