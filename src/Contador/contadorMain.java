package Contador;

public class contadorMain {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        int num = 1000;
//        for(int i=0;i<2;i++){
//            hilo = new Thread(new EmpleadoIncrementador("CarlIncrementador"+i, cont));
//            hilo.start();
//        }

        Thread hilo = new Thread(new Incrementar(contador, num));
        Thread hilo2 = new Decrementar(contador, num);

        Thread hilo3 = new Thread(new Incrementar(contador, num));
        Thread hilo4 = new Decrementar(contador, num);

        Thread hilo5 = new Thread(new Incrementar(contador, num));
        Thread hilo6 = new Decrementar(contador, num);

        hilo.start();
        hilo2.start();

        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();

        hilo.join();
        hilo2.join();

        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();

        System.out.println("Este es tu resultado " + contador.valor);
    }
}