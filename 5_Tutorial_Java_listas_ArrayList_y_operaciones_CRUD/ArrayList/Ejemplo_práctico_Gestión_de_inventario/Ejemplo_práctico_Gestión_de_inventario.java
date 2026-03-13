package Ejemplo_práctico_Gestión_de_inventario;

import java.util.ArrayList;

public class Ejemplo_práctico_Gestión_de_inventario {
    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();
        inventario.add("Laptop");
        inventario.add("Teléfono");
        inventario.add("Tablet");
        inventario.add("Auriculares");

        System.out.println("Inventario inicial:");
        mostrarInventario(inventario);

        String productoBuscado = "Tablet";
        if (inventario.contains(productoBuscado)) {
            System.out.println("\nEl producto '" + productoBuscado + "' está en el inventario");
            System.out.println("Posición: " + inventario.indexOf(productoBuscado));
        }

        int posicionTelefono = inventario.indexOf("Teléfono");
        if (posicionTelefono != -1) {
            inventario.set(posicionTelefono, "Smartphone");
            System.out.println("\nProducto actualizado");
        }

        boolean eliminado = inventario.remove("Auriculares");
        if (eliminado) {
            System.out.println("Producto 'Auriculares' eliminado");
        }

        System.out.println("\nInventario actualizado:");
        mostrarInventario(inventario);
    }

    private static void mostrarInventario(ArrayList<String> inventario) {
        for (int i = 0; i < inventario.size(); i++) {
            System.out.println((i + 1) + ". " + inventario.get(i));
        }
    }
}
