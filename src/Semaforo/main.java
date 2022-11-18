package Semaforo;

import Pila.Pila;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Parking parking = new Parking();
        int cantCoches = 1000;
        ArrayList<Thread> array = new ArrayList();
        for (int i = 0 ; i < cantCoches;i++){
            array.add(new Coche(i,parking));
        }
        array.forEach((t) ->{
            t.start();
        });
        array.forEach((t) ->{
            try {
                t.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

    }
}
