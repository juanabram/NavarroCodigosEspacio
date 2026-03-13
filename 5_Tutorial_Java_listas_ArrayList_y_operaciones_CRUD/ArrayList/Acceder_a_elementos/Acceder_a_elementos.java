package Acceder_a_elementos;

import java.util.ArrayList;

public class Acceder_a_elementos {
    public static void main(String[] args) {
        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Conejo");

        String primerAnimal = animales.get(0);
        String ultimoAnimal = animales.get(animales.size() - 1);
        System.out.println ( primerAnimal ) ;
        System.out.println ( ultimoAnimal ) ;
    }
}
