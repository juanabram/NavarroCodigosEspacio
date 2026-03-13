package Declaración_y_uso_básico_de_List;

import java.util.List;
import java.util.ArrayList;

public class Declaración_y_uso_básico_de_List {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Carlos");
        nombres.add("Beatriz");

        String primerNombre = nombres.get(0); // "Ana"
        nombres.add(1, "Daniel"); // Inserta en posición específica

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        int cantidad = nombres.size(); // 4
    }
}
