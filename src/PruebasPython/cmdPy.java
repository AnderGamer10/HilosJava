package PruebasPython;

import java.io.IOException;
import java.util.Scanner;

public class cmdPy {
    public static void main(String[] args) throws IOException, InterruptedException {
        try{
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Escribeme el comando wey");
                String comando = sc.nextLine();
                ProcessBuilder pb = new ProcessBuilder("cmd", "/C", comando);
                pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                pb.redirectError(ProcessBuilder.Redirect.INHERIT);
                Process p = pb.start();
            }
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}
