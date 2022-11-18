package Contador;

public class hiloContador implements Runnable{
    Contador num;
    Decrementar dec;
    int hilo;
    public hiloContador(Contador num, int hilo, Decrementar dec){
        this.num = num;
        this.hilo = hilo;
        this.dec = dec;
    }
    @Override
    public void run() {
        num.Incrementar();
        try {
            num.Decrementar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        System.out.println("El valor del hilo " +hilo + " es " + num.valor);


    }
}
