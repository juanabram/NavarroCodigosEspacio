package Iteración_sobre_List;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Iteración_sobre_List {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        Iterator<Integer> iterador = numeros.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
