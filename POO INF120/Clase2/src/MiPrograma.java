public class MiPrograma {

    public static void main(String[] args) {
        
        // Se llama a la clase Persona
        Libro primerLibro;
        
        // Se limpia con el metodo constructor
        primerLibro = new Libro();
        
        // Escribimos los datos con los metodos setters
        primerLibro.ponerCodigo("1XXX01");
        primerLibro.ponerNombre("Chaskañawi");
        primerLibro.ponerAutor("Carlos Medinacelli");
        
        // Leemos los datos con los metodos getters
        String cod = primerLibro.sacarCodigo();
        String nom = primerLibro.sacarNombre();
        String aut = primerLibro.sacarAutor();
        
        // Imprimimos los datos
        System.out.println("El libro es: " + nom + ", con codigo " + cod + " y autor: " + aut + ".");
    }
    
}
