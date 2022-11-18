package PruebasPython;

import java.io.*;
import java.util.Scanner;

public class nslookUpSinRedirigir {
    public static void main(String[] args) throws IOException, InterruptedException {
//        while (true){
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Introduceme la IP");
//            String ip = sc.nextLine();
//            if (ip.equalsIgnoreCase("exit")){
//                break;
//            }
//            ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "nslookup " + ip);
//            pb.redirectError(ProcessBuilder.Redirect.INHERIT);
//            Process process = pb.start();
//
//            InputStream inputStream = process.getInputStream();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//        }

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduceme la IP");
            String ip = sc.nextLine();

            ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "nslookup ");
            pb.redirectError(ProcessBuilder.Redirect.INHERIT);
            try {
                    Process p = pb.start();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));

                    bufferedWriter.write(ip);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(p.getInputStream()));

                    String linea;
                    while ((linea = bufferedReader.readLine()) != null) {
                            System.out.println(linea);
                    }
            }catch (Exception e){
                    System.out.println(e.getMessage());
            }


    }
}
