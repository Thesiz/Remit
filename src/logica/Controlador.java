package logica;

import datos.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import modelos.Estetica;

public class Controlador {
    public static ArrayList<Publicacion> listaPublicaciones = new ArrayList<Publicacion>();
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public static void inicializarDatos() {
        Controlador.listaPublicaciones = Archivo.leerPublicaciones();
        Controlador.listaUsuarios = Archivo.leerUsuarios();
    }

    public void mostrarTodasPublicaciones() {
        int i = 0;
        for (Publicacion elemento : listaPublicaciones) {
            System.out.println(++i + ". " + elemento);
        }
    }

    public void verTutorias() {
        for (Publicacion element : listaPublicaciones) {
            if (element.getCategoria().getCodigo() == 01) {
                System.out.println(element);
            }

        }
    }

    public void verInstitucionales() {
        for (Publicacion element : listaPublicaciones) {
            if (element.getCategoria().getCodigo() == 02) {
                System.out.println(element);
            }

        }

    }

    public void verEstudiantiles() {
        for (Publicacion element : listaPublicaciones) {
            if (element.getCategoria().getCodigo() == 03) {
                System.out.println(element);
            }

        }

    }

    public void verGruposEstudio() {
        for (Publicacion element : listaPublicaciones) {
            if (element.getCategoria().getCodigo() == 04) {
                System.out.println(element);
            }

        }

    }

    public void verVentasServicios() {
        for (Publicacion element : listaPublicaciones) {
            if (element.getCategoria().getCodigo() == 05) {
                System.out.println(element);
            }

        }

    }

    public void calendario() {
        System.out.println("Calendario Academico");
        System.out.println("http://bogota.unal.edu.co/calendario-academico/");
        System.out.println("-------------------------\n");

    }

    public static void buscar(String palabra) {
        for (Publicacion elemento : Controlador.listaPublicaciones) {
            if ((elemento.getTitulo().contains(palabra))
                    || (elemento.getDescripcion().contains(palabra))) {
                System.out.println(elemento);
            }
        }
    }

    public static boolean iniciarSesion(String usuario, String contraseña) {
        boolean datosCorrectos = false;
        for (Usuario usuarioTemp : listaUsuarios) {
            if (usuarioTemp.getUsuario().equals(usuario) && usuarioTemp.getContraseña()
                    .equals(contraseña)) {
                
                Estetica.mostrarOcultarComponente(Estetica.labelTemp, usuarioTemp.getNombre()
                        +" "+usuarioTemp.getApellido(), true);
                usuarioTemp.setActivo(true);
                Archivo.guardarUsuarios(listaUsuarios);
                datosCorrectos = true;
                //System.out.println(usuarioTemp.getActivo());
            }
        }
        //if (!datosCorrectos) {
        /*System.err.println("Usuario o contraseña incorrectos\n");
            System.out.println("Seleccione una opcion: \n1. Intentarlo de nuevo\n"
                    + "2. Regresar al menu");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                Controlador.iniciarSesion();
            } else if (opcion != 2) {
                System.err.print("Opción inválida. Regresando al menú principal\t");
                for (int i = 0; i < 3; i++) {
                    System.err.print(3 - i + "...");
                    Thread.sleep(1500);
                }
            }*/
        //}
        return datosCorrectos; 
    }

    public static boolean registrar(String nombre, String apellido, String usuario, String contraseña) {

        boolean usuarioExiste = false;
            for (Usuario usuarioHash : listaUsuarios) {
                if (usuario.equals(usuarioHash.getUsuario())) {
                    System.err.println("Este usuario ya existe, por favor pruebe con otro\n");
                    usuarioExiste = true;
                    break;
                }
            }

        Usuario usuarioTemp = new Usuario(nombre, apellido, usuario, contraseña, true);
        return usuarioExiste;
    }

    public static void cerrarSesion(Usuario usuario) {
        usuario.setActivo(false);
        System.out.println("Sesion Termianda");

    }

   

    

   
}
