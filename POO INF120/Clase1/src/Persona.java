public class Persona {
    
    // Atributos
    private String nombre;
    private String apellidos;
    private int telefono;
    private String correo;
    
    // Constructor
    public Persona() {
        nombre = "";
        apellidos = "";
        telefono = 0;
        correo = "";
    }
    
    // Metodos setters
    public void ponerNombre(String x){
        nombre = x;
    }
    public void ponerApellidos(String x){
        apellidos = x;
    }
    public void ponerTelefono(int x){
        telefono = x;
    }
    public void ponerCorreo(String x){
        correo = x;
    }
    
    // Metodos getters
    public String sacarNombre(){
        return nombre;
    }
    public String sacarApellidos(){
        return apellidos;
    }
    public int sacarTelefono(){
        return telefono;
    }
    public String sacarCorreo(){
        return correo;
    }
}
