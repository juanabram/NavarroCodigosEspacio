package Crear_un_ArrayList;

import java.util.ArrayList;

public class Crear_un_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>(20); // capacidad inicial
        ArrayList<String> copiaDeNombres = new ArrayList<>(nombres);
    }
}
