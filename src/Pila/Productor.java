package Pila;

public class Productor extends Thread{
    Pila pila;
    int num;
    public Productor(int num, Pila pila){
        this.num = num;
        this.pila = pila;
    }
    @Override
    public void run() {
        while (true){
            try {
                pila.anadirProducto(num);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
