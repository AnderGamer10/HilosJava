package Pila;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pila {
    Deque<String> stack = new ArrayDeque<String>();
    int cantidadProductos = 0;
    Object lock1 = new Object();
    public void anadirProducto(int num) throws InterruptedException {
        synchronized (lock1){
            while (cantidadProductos >= 5){
                lock1.wait();
            }
            cantidadProductos++;
            stack.add("producto num: " + num);
            System.out.println("Añadir el numero: " + num);
            lock1.notifyAll();
        }
    }
    public void obtenerProducto() throws InterruptedException {
        synchronized (lock1){
            while (cantidadProductos <= 0){
                lock1.wait();
            }
            cantidadProductos--;
            System.out.println("Obteniendo el " + stack.pop());
            lock1.notifyAll();
        }

    }
}
