package datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import logica.*;

public class Usuario extends Persona implements ControladorCRUD {

    private boolean activo;
    private static ArrayList<Publicacion> misPublicaciones = new ArrayList<>();

    public Usuario(String nombre, String apellido, String usuario, String contraseña, boolean activo) {
        super(nombre, apellido, usuario, contraseña);
        this.activo = activo;
        Controlador.listaUsuarios.add(this);
        Controlador.mapaUsuarios.put(usuario, this);
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
    }

    @Override
    public void editar(Publicacion publicacionEditar, Usuario usuario) {
        publicacionEditar = new Publicacion(publicacionEditar.getCategoria(), usuario, publicacionEditar.getFecha(), publicacionEditar.getTitulo(),
                publicacionEditar.getDescripcion());
        System.out.println(publicacionEditar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);

    }

    @Override
    public void eliminar() {
        boolean prueba = true;
        int i = 0, contador = 0, opcion = 0;
        Usuario usuario = this;
        Scanner entrada = new Scanner(System.in);
        Usuario.verMisPublicaciones(usuario);
        int maximo = Usuario.cantidadMisPublicaciones(usuario);
        System.out.print("Selecciona la publicacion que deseas eliminar: ");
        do {
            try {
                opcion = entrada.nextInt();
                prueba = false;
                ExcepcionIntervalo.verificaRango(opcion, 1, maximo);
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());
                prueba = true;
            }
        } while (prueba);
        Publicacion publicacionEliminar = Controlador.listaPublicaciones.get(opcion - 1);
        System.out.println("¿Seguro que deseas elminar la publicacion " + publicacionEliminar.getTitulo() + "?");
        Usuario.getMisPublicaciones().remove(publicacionEliminar);
        Controlador.listaPublicaciones.remove(publicacionEliminar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
        System.out.println("Publicacion eliminada");

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
