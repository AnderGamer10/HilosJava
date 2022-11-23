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
        try {
            InputStream inputStream = cliente.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String linea;
            while ((linea = bufferedReader.readLine()) != null){
                String lineaFinal = "Cliente " + contador +" escribe: " + linea;
                System.out.println(lineaFinal);
                main.listSockets.forEach(socket -> {
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        bufferedWriter.write(lineaFinal);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
