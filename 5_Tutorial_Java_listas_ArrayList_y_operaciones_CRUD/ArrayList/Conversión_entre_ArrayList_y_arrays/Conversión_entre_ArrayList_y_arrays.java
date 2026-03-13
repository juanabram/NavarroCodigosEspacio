package Conversión_entre_ArrayList_y_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversión_entre_ArrayList_y_arrays {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);

        Integer[] arrayNumeros = listaNumeros.toArray(new Integer[0]);

        String[] frutas = {"Manzana", "Pera", "Uva"};
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList(frutas));
    }
}
