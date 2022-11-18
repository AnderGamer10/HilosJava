package nsLookUpConThread;

import java.io.*;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) throws InterruptedException, IOException {
        boolean terminaMain = false;
        Scanner sc = new Scanner(System.in);
        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "nslookup ");
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        Process p = pb.start();
        HiloLectura hilo1 = new HiloLectura(p);
        hilo1.start();

        while (!terminaMain){
            System.out.println("Introduceme la IP");
            String ip = sc.nextLine();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));


            bufferedWriter.write(ip);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            if (ip.equalsIgnoreCase("exit")){
                hilo1.parar();
                bufferedWriter.close();
                p.destroy();
                terminaMain = true;
            }
        }

    }
}
