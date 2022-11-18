package nsLookUpConThread;

import java.io.*;

public class HiloLectura extends Thread{
    Process p;
    boolean termina = false;
    public HiloLectura( Process p){
        this.p = p;
    }
    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while (!termina){
                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    System.out.println(linea);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void parar(){
        termina = true;
        System.out.println("Hilo terminado");
    }

}
