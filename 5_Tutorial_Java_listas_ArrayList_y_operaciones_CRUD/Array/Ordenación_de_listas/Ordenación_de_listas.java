package Ordenación_de_listas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ordenación_de_listas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Zoe");
        nombres.add("Ana");
        nombres.add("Carlos");

        Collections.sort(nombres); // Ordena alfabéticamente
        nombres.sort(Comparator.naturalOrder()); // Otra forma
        System.out.println ( nombres ) ;
    }
}
