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

    public static void inicializarPublicaciones() {
        Controlador.listaPublicaciones = Archivo.leerPublicaciones();
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
                System.out.println("Bienvenido " + usuarioTemp.getNombre());
                usuarioTemp.setActivo(true);
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

    public static void cerrarSesion(Administrador admin) {
        admin.setActivo(false);
        System.out.println("Sesion Termianda");

    }

    public static void remit(Administrador admin) {
        admin.agregar();
    }

    public static void miPerfil(Usuario usuario) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(usuario);
        System.out.println(Usuario.verMisPublicaciones(usuario));

        //poner manejo de ecepciones!!
        System.out.println("Seleccione: "
                + "\n1. Editar Publicacion"
                + "\n2. Borrar Publicacion");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            //LOGICA EDITAR PUBLICACION
            usuario.editar();
        } else if (opcion == 2) {
            usuario.eliminar();
            //LOGICA BORRAR PUBLICACION
        }

    }

    public static void perfilAdmin(Administrador admin) {
        Scanner entrada = new Scanner(System.in);

        //poner manejo de ecepciones!!
        System.out.println("Seleccione: "
                + "\n1. Editar Publicacion"
                + "\n2. Borrar Publicacion"
                + "\n3. Editar ccualquier Publicacion"
                + "\n4. Borrar cualquier Publicacion"
                + "\n5. Eliminar Usuario");

        int opcion = entrada.nextInt();
        if (opcion == 1) {

            admin.editar();
        } else if (opcion == 2) {
            admin.eliminar();

        } else if (opcion == 3) {
            admin.editarCualquierPub();

        } else if (opcion == 4) {
            admin.eliminarCualquierPub();

        } else if (opcion == 5) {

            //LOGICA POR TERMINAR
        }

    }

    public void accesoAdministrador(Administrador admin) {

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
        if (opcion == Integer.parseInt(admin.getContraseña())) {

            // POR HACER! acceder a mis publicaciones de administrador
            System.out.println("Acceso correcto!");
            admin.setActivo(true);

        } else {
            System.out.println("Acceso denegado!");
        }

    }
}
