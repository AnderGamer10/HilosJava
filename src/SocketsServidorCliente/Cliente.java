package SocketsServidorCliente;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {

        Socket sock = new Socket("localhost",6666);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe");
        bufferedWriter.write(sc.nextLine() + " cliente ");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        String linea;
        while ((linea = bufferedReader.readLine()) != null) {
            System.out.println("Clientes " + linea);
        }
    }
}
