package SocketsServidorCliente;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class main {
    static List<Socket> listSockets = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        int contador = 0;
        while (true){
            Socket cliente = serverSocket.accept();
            listSockets.add(cliente);
            new Thread(new Hilo(cliente, contador)).start();
            contador++;
        }

    }
}
