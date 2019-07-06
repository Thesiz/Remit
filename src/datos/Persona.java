package datos;
public abstract class Persona {
    private String nombre;
    private String usuario;
    private String contraseña;
    
   public Persona(String nombre, String usuario, String contraseña){
       this.nombre = nombre;
       this.usuario = usuario;
       this.contraseña = contraseña;
   }
}
