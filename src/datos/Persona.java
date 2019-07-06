package datos;

import java.io.Serializable;

public abstract class Persona implements Serializable{
    private String nombre;
    private String usuario;
    private String contraseña;
    private boolean activo;
    
   public Persona(String nombre, String usuario, String contraseña){
       this.nombre = nombre;
       this.usuario = usuario;
       this.contraseña = contraseña;
   }  

    public void setActivo(boolean estado) {
        this.activo = estado;
    }
    
    public void imprimeHola(){
        System.out.println("Hola");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
