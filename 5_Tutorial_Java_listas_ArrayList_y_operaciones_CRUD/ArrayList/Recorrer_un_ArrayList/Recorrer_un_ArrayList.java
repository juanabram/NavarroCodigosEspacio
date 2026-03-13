package Recorrer_un_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Recorrer_un_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> lenguajes = new ArrayList<>();
        lenguajes.add("Java");
        lenguajes.add("Python");
        lenguajes.add("JavaScript");

        for (int i = 0; i < lenguajes.size(); i++) {
            System.out.println(lenguajes.get(i));
        }

        for (String lenguaje : lenguajes) {
            System.out.println(lenguaje);
        }

        Iterator<String> it = lenguajes.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
