package hilos;

import java.util.ArrayList;
import java.util.List;

public class pruebaHilos1 {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<tarea> listaTareas = new ArrayList<>();
        for (int i = 0; i < 3;i++){
            listaTareas.add(new tarea((i+1)*5));
        }

        ArrayList<Thread> Empleados = new ArrayList<>();
        for (int i = 0; i < listaTareas.size();i++){
            Empleados.add(new Thread(new Empleado(listaTareas.get(i),"antonio "+i)));
        }

        for (Thread empleado: Empleados){
            empleado.run();
        }


//        TODO: Hilos con RUNNABLE
//        Thread hiloConInterfaz = new Thread(new hiloConInterfaz("antonio"));
//        hiloConInterfaz.run();


////      TODO: Varios hilos para procesar los productos
//        ArrayList<String> lista = new ArrayList<>();
//        for (int i = 0; i < 100;i++){
//            lista.add("Producto " + i);
//        }
//        for (String s: lista){
////            System.out.println("Procesando tu producto " + s);
////            Thread.sleep(20000);
//            hiloDouble hilazo = new hiloDouble("Procesando tu producto " + s);
//            hilazo.start();
//        }


//        TODO: Creando 1000 hilos y observando si se han cerrado con join ----------------------------------------------
//        List<hiloDouble> arrayLista = new ArrayList<>();
//        for (int i = 0; i < 1000;i++){
//            hiloDouble hilazo = new hiloDouble("Hilo " + i);
//            arrayLista.add(hilazo);
//            hilazo.start();
//        }
//        for (int i = 0; i < arrayLista.size();i++){
//            arrayLista.get(i).join();
//        }
//        System.out.println("Terminado");
    }
}
