package Modificar_elementos;

import java.util.ArrayList;

public class Modificar_elementos {
    public static void main(String[] args) {
        ArrayList<Double> precios = new ArrayList<>();
        precios.add(19.99);
        precios.add(29.99);
        precios.add(9.99);

        System.out.println ( precios ) ;
        precios.set(1, 24.99); // cambia 29.99 por 24.99
        System.out.println ( precios ) ;
    }
}
