package SocketsServidorCliente;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6666);

        new Thread(() -> {
            while (true) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    String message = scanner.nextLine();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    bufferedWriter.write(message);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }).start();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String linea;

        while ((linea = bufferedReader.readLine()) != null){
            System.out.println(linea);
        }

    }
}
