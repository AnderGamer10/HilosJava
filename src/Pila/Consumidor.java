package Pila;

public class Consumidor extends Thread{
    Pila pila;
    int num;
    public Consumidor(int num, Pila pila){
        this.num = num;
        this.pila = pila;
    }
    @Override
    public void run() {
        while (true){
            try {
                pila.obtenerProducto();
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
