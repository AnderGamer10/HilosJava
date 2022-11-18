package hilos;

public class Empleado implements Runnable{
    String nombre;
    tarea latarea;
    public Empleado(tarea latarea,String nombre){
        this.nombre = nombre;
        this.latarea = latarea;
    }
    @Override
    public void run() {
        System.out.println("Este empleado llamado " + nombre + " esta con una tarea " + latarea.tiempoDeEjecucion);
    }
}
