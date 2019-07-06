package datos;

import java.util.ArrayList;

public class Usuario extends Persona{
    private boolean activo;
    private static ArrayList<Publicacion> misPublicaciones = new ArrayList <>();

    public Usuario(String nombre, String usuario, String contraseña) {
        super(nombre, usuario, contraseña);
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static void agregarPublicacion (Publicacion publicacion){
        misPublicaciones.add(publicacion);
    }
    
    public static ArrayList<Publicacion> getMisPublicaciones() {
        return misPublicaciones;
    }

    public void setMisPublicaciones(ArrayList<Publicacion> misPublicaciones) {
        this.misPublicaciones = misPublicaciones;
    }
    
    
    
}
