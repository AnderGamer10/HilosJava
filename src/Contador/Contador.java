package Contador;

import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class Contador{
    int valor=0;
    Object lock1 = new Object();
    public void Incrementar() {
        synchronized(lock1) {
            while(valor==10){
                try {
                    lock1.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Thread Interrupted");
                }
            }
            valor++;
            System.out.println("Ha incrementado a " + valor);
        }
    }
    public void Decrementar() throws InterruptedException {
        synchronized(lock1) {
            valor--;
            System.out.println("Ha decrementado a " + valor);
            lock1.notifyAll();
        }
    }
//    AtomicInteger atomicInteger = new AtomicInteger();
//
//    public void incrementar(){
//        atomicInteger.getAndIncrement();
//    }
}
