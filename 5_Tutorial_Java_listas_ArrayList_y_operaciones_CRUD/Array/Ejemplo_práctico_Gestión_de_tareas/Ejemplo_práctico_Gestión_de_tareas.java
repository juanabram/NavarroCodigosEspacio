package Ejemplo_práctico_Gestión_de_tareas;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo_práctico_Gestión_de_tareas {
    public static void main(String[] args) {
        List<String> tareas = new ArrayList<>();
        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicio");
        tareas.add("Comprar comida");

        System.out.println("Lista de tareas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.println("\nCompletando: " + tareas.get(1));
        tareas.remove(1);

        tareas.add(0, "Llamar al médico");

        System.out.println("\nLista actualizada:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }
    }
}
