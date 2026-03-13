package Operaciones_comunes;

import java.util.List;
import java.util.ArrayList;

public class Operaciones_comunes {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");

        boolean contieneManzana = frutas.contains("Manzana"); // true
        boolean contienePera = frutas.contains("Pera"); // false

        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Verde");

        colores.remove(0); // Elimina "Rojo"
        colores.remove("Verde"); // Elimina el primer "Verde"
        System.out.println(colores); // [Azul, Verde]
    }
}
