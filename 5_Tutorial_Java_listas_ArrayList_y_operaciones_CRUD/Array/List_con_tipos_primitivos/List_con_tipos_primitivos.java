package List_con_tipos_primitivos;

import java.util.List;
import java.util.ArrayList;

public class List_con_tipos_primitivos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        int primerNumero = numeros.get(0); // 10
        System.out.println ( primerNumero ) ;
    }
}