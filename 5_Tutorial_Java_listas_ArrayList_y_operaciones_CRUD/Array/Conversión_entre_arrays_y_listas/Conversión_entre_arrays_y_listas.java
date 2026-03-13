package Conversión_entre_arrays_y_listas;

import java.util.List;
import java.util.Arrays;

public class Conversión_entre_arrays_y_listas {
    public static void main(String[] args) {
        String[] arrayPaises = {"España", "Francia", "Italia"};
        List<String> listaPaises = Arrays.asList(arrayPaises);

        String[] nuevoArray = listaPaises.toArray(new String[0]);
        System.out.println( nuevoArray );
    }
}
