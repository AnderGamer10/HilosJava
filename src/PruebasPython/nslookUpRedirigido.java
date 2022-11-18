package PruebasPython;

import java.io.IOException;

public class nslookUpRedirigido {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Introduceme la IP");
            ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "nslookup ");
            pb.inheritIO();
            try {
                Process p = pb.start();
                p.waitFor();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

}
