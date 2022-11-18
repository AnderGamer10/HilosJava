package hilos;

public class tarea{
    int tiempoDeEjecucion;
    public tarea(int tiempo){
        this.tiempoDeEjecucion = tiempo * 1000;
    }
    public void ejecutar(){
        System.out.println("Ejecutando la tarea de tu vida " + tiempoDeEjecucion + " milisegundos");
        try {
            Thread.sleep(tiempoDeEjecucion);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
