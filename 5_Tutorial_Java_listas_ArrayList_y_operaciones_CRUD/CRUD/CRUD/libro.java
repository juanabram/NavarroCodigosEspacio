package CRUD;


class Libro {
    private int id;
    private String titulo;
    private String autor;
    private boolean prestado;
    
    public Libro(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }
    
    // Getters y setters
    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isPrestado() { return prestado; }
    
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setPrestado(boolean prestado) { this.prestado = prestado; }
    
    @Override
    public String toString() {
        return "Libro #" + id + ": '" + titulo + "' de " + autor + 
               (prestado ? " (Prestado)" : " (Disponible)");
    }
}