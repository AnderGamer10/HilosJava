package SocketsServidorCliente;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(6666);
        List<Hilo> listaDeClientes = new ArrayList<>();
        int contador = 0;
        while (true){
            Socket cliente = serverSocket.accept();
            contador++;
            listaDeClientes.add(new Hilo(cliente,contador));
            listaDeClientes.get(listaDeClientes.size()-1).start();

        }


    }
}
