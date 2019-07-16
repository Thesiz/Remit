package datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.*;

public class Usuario extends Persona implements ControladorCRUD {

    private boolean activo;
    private static ArrayList<Publicacion> misPublicaciones = new ArrayList<>();

    public Usuario(String nombre, String apellido, String usuario, String contraseña, boolean activo) {
        super(nombre, apellido, usuario, contraseña);
        this.activo = activo;
        Controlador.listaUsuarios.add(this);
        Archivo.guardarUsuarios(Controlador.listaUsuarios);
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean getActivo() {
        return this.activo;
    }

    public static void agregarPublicacion(Publicacion publicacion) {
        misPublicaciones.add(publicacion);
        Controlador.listaPublicaciones.add(publicacion);
    }

    public static ArrayList<Publicacion> getMisPublicaciones() {
        return misPublicaciones;
    }

    public void setMisPublicaciones(ArrayList<Publicacion> misPublicaciones) {
        this.misPublicaciones = misPublicaciones;
    }

    //esta vaina no sirve?? pa eso esta la composision?
    public static ArrayList<Publicacion> verMisPublicaciones(Usuario temp) {
        int i = 0;
        for (Publicacion elemento : Controlador.listaPublicaciones) {
            Usuario user = elemento.getUsuario();
            String usuario = user.getUsuario();
            if (usuario.equals(temp.getUsuario())) {
                misPublicaciones.add(elemento);
            }
        }
        return misPublicaciones;
    }

    public static int cantidadMisPublicaciones(Usuario temp) {
        int i = 0;
        for (Publicacion elemento : Controlador.listaPublicaciones) {
            Usuario user = elemento.getUsuario();
            String usuario = user.getUsuario();
            if (usuario.equals(temp.getUsuario())) {
                System.out.println(++i + ". " + elemento);
                misPublicaciones.add(elemento);
            }
        }
        return misPublicaciones.size();
    }

    @Override
    public void agregar(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion) {
        Archivo.leerPublicaciones();
        usuario = this;
        Date fechaPub = new Date();
        Publicacion nuevaPublicacion = new Publicacion(categoria, usuario, fechaPub, titulo, descripcion);
        Usuario.agregarPublicacion(nuevaPublicacion);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
        System.out.println("Publicacion creada");
        System.out.println(nuevaPublicacion);
    }

    @Override
    public void editar(Publicacion publicacionEditar, Usuario usuario) {
        publicacionEditar = new Publicacion(publicacionEditar.getCategoria(), usuario, publicacionEditar.getFecha(), publicacionEditar.getTitulo(),
                publicacionEditar.getDescripcion());
        System.out.println(publicacionEditar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
    }

    @Override
    public void eliminar(Publicacion publicacionEliminar) {
        String[] botones = {"Si", "No"};
        int opcion = JOptionPane.showOptionDialog(null, "¿Estas seguro de eliminar esta publicación?", "Remit",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, botones, botones[1]);
        if (opcion == 0) {
            Usuario.getMisPublicaciones().remove(publicacionEliminar);
            Controlador.listaPublicaciones.remove(publicacionEliminar);
            Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
            
            System.out.println("Publicacion eliminada");
         
        }

    }

    @Override
    public String toString() {
        String valor = "NOMBRE:  " + super.getNombre()
                + "\nUSUARIO: @" + super.getUsuario();

        return valor;
    }

    @Override
    public void agregar(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion, String nombreImg) {
        Archivo.leerPublicaciones();
        usuario = this;
        Date fechaPub = new Date();
        Publicacion nuevaPublicacion = new Publicacion(categoria, usuario, fechaPub, titulo, descripcion, nombreImg);
        Usuario.agregarPublicacion(nuevaPublicacion);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
        System.out.println("Publicacion Completada!");
    }

    @Override
    public void editar(Publicacion publicacion, Usuario usuario, String nombreImg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
