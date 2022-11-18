package Contador;

public class Incrementar implements Runnable{
    Contador contador;
    int num;
    public Incrementar(Contador contador, int num){
        this.contador=contador;
        this.num = num;
    }

    @Override
    public void run(){
        for (int i=0; i < num;i++) {
            contador.Incrementar();
//            System.out.println("El hilo actualizado a " + contador.valor);
        }
    }
}
