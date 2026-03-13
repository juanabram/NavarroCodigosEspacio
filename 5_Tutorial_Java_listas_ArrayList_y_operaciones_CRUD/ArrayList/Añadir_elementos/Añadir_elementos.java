package Añadir_elementos;

import java.util.ArrayList;

public class Añadir_elementos {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add(1, "Valencia"); // inserta en posición específica
        System.out.println ( ciudades ) ;
    }
}
