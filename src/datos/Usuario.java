package datos;

import java.util.ArrayList;

public class Usuario extends Persona{
    private boolean activo;
    private ArrayList<Publicacion> misPublicaciones;
    
    public Usuario(String nombre, String usuario, String contraseña){
        super(nombre, usuario, contraseña);
        this.activo = true;      
    }
   
    
}
