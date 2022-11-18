package pingpong;

public class mainpiongyang {
    public static void main(String[] args) throws InterruptedException {
        Pelota pelota = new Pelota();
        int num = 1000;

        Thread hilo1 = new Ping("Equipo 1: Jugador 1",pelota, num);
        Thread hilo2 = new Thread(new Pong("Equipo 2: Jugador 1",pelota, num));

        Thread hilo3 = new Ping("Equipo 1: Jugador 2",pelota, num);
        Thread hilo4 = new Thread(new Pong("Equipo 2: Jugador 2",pelota, num));

        Thread hilo5 = new Ping("Equipo 1: Jugador 3",pelota, num);
        Thread hilo6 = new Thread(new Pong("Equipo 2: Jugador 3",pelota, num));

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();
        hilo6.join();
    }
}
