package Contador;

public class Decrementar extends Thread{
    Contador contador;
    int num;
    public Decrementar(Contador contador,int num){
        this.contador=contador;
        this.num = num;
    }
    @Override
    public void run(){
        for (int i=0; i < num;i++) {
            try {
                contador.Decrementar();
                sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println("El hilo actualizado a " + contador.valor);
        }
    }
}