package datos;

import java.util.ArrayList;
import logica.*;

public class Usuario extends Persona{
    private boolean activo;
    private static ArrayList<Publicacion> misPublicaciones = new ArrayList <>();

    public Usuario(String nombre, String usuario, String contraseña, boolean activo) {
        super(nombre, usuario, contraseña);
        this.activo = activo;
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
    
    public static ArrayList<Publicacion> encontrarMisPublicaciones (Usuario temp){
        ArrayList<Publicacion> temporal = new ArrayList<>();
        int i = 0;
        for (Publicacion elemento : Controlador.listaPublicaciones){
            Usuario user = elemento.getUsuario();
            String usuario = user.getUsuario();
            if (usuario.equals(temp.getUsuario())){
                System.out.println(++i + ". " + elemento);
                temporal.add(elemento);
            }
        }
        return temporal;
    }
    
}
