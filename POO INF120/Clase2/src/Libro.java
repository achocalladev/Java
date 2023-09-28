public class Libro {
    
    // Atributos
    private String codigo;
    private String nombre;
    private String autor;
    
    // Metodo constructor
    public Libro() {
        codigo = "";
        nombre = "";
        autor = "";
    }
    
    // Metodos setters
    public void ponerCodigo(String x){
        codigo = x;
    }
    public void ponerNombre(String x){
        nombre = x;
    }
    public void ponerAutor(String x){
        autor = x;
    }
    
    // Metodos getters
    public String sacarCodigo(){
        return codigo;
    }
    public String sacarNombre(){
        return nombre;
    }
    public String sacarAutor(){
        return autor;
    }
}