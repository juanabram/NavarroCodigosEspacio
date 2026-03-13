package Eliminar_elementos;

import java.util.ArrayList;

public class Eliminar_elementos {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>();
        tareas.add("Estudiar");
        tareas.add("Ejercicio");
        tareas.add("Compras");
        tareas.add("Ejercicio");

        System.out.println ( tareas ) ;
        tareas.remove(0); // elimina "Estudiar"
        tareas.remove("Ejercicio"); // elimina la primera ocurrencia
        // tareas.clear(); // elimina todos
        
        System.out.println ( tareas ) ;
    }
}
