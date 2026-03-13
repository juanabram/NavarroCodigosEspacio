package CRUD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class BibliotecaApp {
    private ArrayList<Libro> catalogo;
    private int siguienteId;
    private Scanner scanner;
    
    public BibliotecaApp() {
        catalogo = new ArrayList<>();
        siguienteId = 1;
        scanner = new Scanner(System.in);
        
        // Añadir algunos libros de ejemplo
        agregarLibro("Don Quijote", "Miguel de Cervantes");
        agregarLibro("Cien años de soledad", "Gabriel García Márquez");
        agregarLibro("El principito", "Antoine de Saint-Exupéry");
    }
    
    // CREATE: Agregar un nuevo libro
    public void agregarLibro(String titulo, String autor) {
        Libro nuevoLibro = new Libro(siguienteId++, titulo, autor);
        catalogo.add(nuevoLibro);
        System.out.println("Libro agregado: " + nuevoLibro);
    }
    
    // READ: Buscar libros
    public void mostrarTodos() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }
        
        System.out.println("\n=== CATÁLOGO DE LIBROS ===");
        for (Libro libro : catalogo) {
            System.out.println(libro);
        }
    }
    
    public Libro buscarPorId(int id) {
        for (Libro libro : catalogo) {
            if (libro.getId() == id) {
                return libro;
            }
        }
        return null;
    }
    
    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> resultado = new ArrayList<>();
        for (Libro libro : catalogo) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                resultado.add(libro);
            }
        }
        return resultado;
    }
    
    // UPDATE: Actualizar información de un libro
    public boolean actualizarLibro(int id, String nuevoTitulo, String nuevoAutor) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            libro.setTitulo(nuevoTitulo);
            libro.setAutor(nuevoAutor);
            System.out.println("Libro actualizado: " + libro);
            return true;
        }
        System.out.println("Libro no encontrado.");
        return false;
    }
    
    // UPDATE: Cambiar estado de préstamo
    public boolean cambiarEstadoPrestamo(int id) {
        Libro libro = buscarPorId(id);
        if (libro != null) {
            libro.setPrestado(!libro.isPrestado());
            System.out.println("Estado actualizado: " + libro);
            return true;
        }
        System.out.println("Libro no encontrado.");
        return false;
    }
    
    // DELETE: Eliminar un libro
    public boolean eliminarLibro(int id) {
        Iterator<Libro> iterator = catalogo.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getId() == id) {
                iterator.remove();
                System.out.println("Libro eliminado correctamente.");
                return true;
            }
        }
        System.out.println("Libro no encontrado.");
        return false;
    }
    
    // Menú principal
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===");
            System.out.println("1. Ver todos los libros");
            System.out.println("2. Buscar por ID");
            System.out.println("3. Buscar por autor");
            System.out.println("4. Añadir nuevo libro");
            System.out.println("5. Actualizar libro");
            System.out.println("6. Cambiar estado de préstamo");
            System.out.println("7. Eliminar libro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    mostrarTodos();
                    break;
                case 2:
                    System.out.print("Ingrese ID del libro: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Libro libro = buscarPorId(id);
                    if (libro != null) {
                        System.out.println("Libro encontrado: " + libro);
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese nombre del autor: ");
                    String autor = scanner.nextLine();
                    ArrayList<Libro> resultados = buscarPorAutor(autor);
                    if (resultados.isEmpty()) {
                        System.out.println("No se encontraron libros de ese autor.");
                    } else {
                        System.out.println("Libros encontrados:");
                        for (Libro l : resultados) {
                            System.out.println(l);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Título del nuevo libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor del nuevo libro: ");
                    autor = scanner.nextLine();
                    agregarLibro(titulo, autor);
                    break;
                case 5:
                    System.out.print("ID del libro a actualizar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo título: ");
                    String nuevoTitulo = scanner.nextLine();
                    System.out.print("Nuevo autor: ");
                    String nuevoAutor = scanner.nextLine();
                    actualizarLibro(id, nuevoTitulo, nuevoAutor);
                    break;
                case 6:
                    System.out.print("ID del libro a cambiar estado: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    cambiarEstadoPrestamo(id);
                    break;
                case 7:
                    System.out.print("ID del libro a eliminar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    eliminarLibro(id);
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();
        biblioteca.mostrarMenu();
    }
}