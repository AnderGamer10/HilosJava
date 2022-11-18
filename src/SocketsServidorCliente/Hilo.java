package SocketsServidorCliente;

import java.io.*;
import java.net.Socket;

public class Hilo extends Thread{
    Socket cliente;
    int contador;
    public Hilo(Socket cliente, int contador){
        this.cliente = cliente;
        this.contador = contador;
    }
    @Override
    public void run() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(cliente.getOutputStream()));

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println("Server " + linea + contador);
                bufferedWriter.write(linea);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
