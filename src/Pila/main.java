package Pila;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        int cantProducto = 5;

        ArrayList<Thread> array = new ArrayList<>();
        for (int i = 0 ; i < cantProducto;i++){
            array.add(new Productor(i, pila));
            array.add(new Consumidor(i, pila));
        }
        array.forEach((t) ->{
            t.start();
        });
    }
}
