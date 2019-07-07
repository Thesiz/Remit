package logica;

import datos.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controlador {

    public static HashMap<String, Usuario> mapaUsuarios = new HashMap<>();
    private final HashMap<String, String> mapaPublicaciones = new HashMap<>();
    public static ArrayList<Publicacion> listaPublicaciones = new ArrayList<Publicacion>();
    public static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public void verTodasLasPublicaciones() {
        System.out.println(listaPublicaciones);
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

    public void buscar() {
        Scanner busqueda = new Scanner (System.in);
        System.out.println("Ingrese una palabra clave...");
        String palabra = busqueda.nextLine();
        for (Publicacion elemento : Controlador.listaPublicaciones) {
            if (palabra.equals(elemento.getTitulo().contains(palabra))
                    || palabra.equals(elemento.getDescripcion().contains(palabra))) {
                System.out.println(elemento);
            }
        }
    }

    public static void iniciarSesion() throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        String usuario = null, contraseña = null;
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+\n     INICIAR SESION\n+-+-+-+-+-+-+-+-+-+-+-+-+\n");
        System.out.print("Ingrese su usuario: ");
        usuario = entrada.nextLine();
        System.out.print("Ingrese su contraseña: ");
        contraseña = entrada.nextLine();

        boolean datosCorrectos = false;
        for (Usuario usuarioTemp : listaUsuarios) {
            if (usuarioTemp.getUsuario().equals(usuario) && usuarioTemp.getContraseña()
                    .equals(contraseña)) {
                System.out.println("Bienvenido " + usuarioTemp.getNombre());
                Thread.sleep(1000);
                usuarioTemp.setActivo(true);
                datosCorrectos = true;
                break;
            }
        }
        if (!datosCorrectos) {
            System.err.println("Usuario o contraseña incorrectos\n");
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
            }
        }
    }

    public static void registrar() {
        /*
         */
        Usuario usuarioTemp2 = new Usuario("Anderson", "anvargasa", "holaMundo", true);
        /*
         */

        Scanner entrada = new Scanner(System.in);
        String nombre = null, usuario = null, contraseña = null;
        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+\n        REGISTRO\n+-+-+-+-+-+-+-+-+-+-+-+-+\n");
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        boolean usuarioExiste = true;
        while (usuarioExiste) {
            System.out.print("Ingrese un usuario: ");
            usuario = entrada.nextLine();

            for (Usuario usuarioHash : listaUsuarios) {
                if (usuario.equals(usuarioHash.getUsuario())) {
                    System.err.println("Este usuario ya existe, por favor pruebe con otro\n");
                } else {
                    usuarioExiste = false;
                }
            }
        }
        System.out.print("Ingrese una contraseña: ");
        contraseña = entrada.nextLine();

        Usuario usuarioTemp = new Usuario(nombre, usuario, contraseña, true);
    }
    
    public void accesoAdministrador() {

        try {
            System.out.println("  _____                   _  _   ");
            System.out.println(" |  __ \\                 (_)| |  ");
            Thread.sleep(1 * 1000);
            System.out.println(" | |__) | ___  _ __ ___   _ | |_ ");
            Thread.sleep(1 * 1000);
            System.out.println(" |  _  / / _ \\| '_ ` _ \\ | || __|");
            System.out.println(" | | \\ \\|  __/| | | | | || || |_ ");
            Thread.sleep(1 * 1000);
            System.out.println(" |_|  \\_\\\\___||_| |_| |_||_| \\__|");
            System.out.println("...");
            Thread.sleep(2 * 1000);
            /*
            Thread.sleep(1 * 1000);
            System.out.println("..");
            Thread.sleep(2 * 1000);
            System.out.println("...");
             */
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("PLEASE TYPE KEY VALUE:");
        Scanner input = new Scanner(System.in);
        int opcion = input.nextInt();
        if (opcion == 102030) {
            // POR HACER! acceder a mis publicaciones de administrador
            System.out.println("Acceso correcto!");

        }

    }
}
