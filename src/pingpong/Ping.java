package pingpong;

public class Ping extends Thread{
    Pelota pelota;
    int num;
    String jugador;
    public Ping(String jugador,Pelota pelota, int num){
        this.pelota = pelota;
        this.num = num;
        this.jugador = jugador;
    }
    @Override
    public void run() {
        for (int i = 0;i < num;i++){
            pelota.ladoPing(jugador);
        }

    }
}
