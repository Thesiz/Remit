package datos;
public abstract class Persona {
    private String nombre;
    private String usuario;
    private String contraseña;
    private boolean activo;
    
   public Persona(String nombre, String usuario, String contraseña){
       this.nombre = nombre;
       this.usuario = usuario;
       this.contraseña = contraseña;
   }  
    public void setActivo(boolean activity) {
        this.activo = activity;
        System.out.println(activity + "cambio alejandra");
    }   
   
}
