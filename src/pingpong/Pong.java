package pingpong;

import static java.lang.Thread.sleep;

public class Pong implements Runnable{
    Pelota pelota;
    int num;
    String jugador;
    public Pong(String jugador, Pelota pelota, int num){
        this.pelota = pelota;
        this.num = num;
        this.jugador = jugador;
    }

    @Override
    public void run() {
        for (int i = 0;i < num;i++){
            pelota.ladoPong(jugador);
        }
    }
}
