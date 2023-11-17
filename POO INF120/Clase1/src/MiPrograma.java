public class MiPrograma {
    
    public static void main(String[] args){
    
        // Llamando a mi clase Persona
        Persona primerPersona;
        
        // Se limpian los objetos con el metodo constructor
        primerPersona = new Persona();
        
        // Escribimos los datos con los metodos setters
        primerPersona.ponerNombre("Fernando");
        primerPersona.ponerApellidos("Achocalla Estrada");
        primerPersona.ponerTelefono(67786830);
        primerPersona.ponerCorreo("achocalla@gmail.com");
        
        // Leemos los datos con los metodos getters
        String nom = primerPersona.sacarNombre();
        String apell = primerPersona.sacarApellidos();
        int tel = primerPersona.sacarTelefono();
        String cor = primerPersona.sacarCorreo();
        
        System.out.println("Mi nombre y apellidos es: " + nom + " " + apell + ", mi telefono es el " + tel + " y correo el " + cor + ".");
        
        
    }
    
}
