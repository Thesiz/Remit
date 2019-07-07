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
                System.out.println("Bienvenido "+usuarioTemp.getNombre());
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
                    System.err.print(3 - i+"...");
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
}
