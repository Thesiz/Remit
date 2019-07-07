package logica;

import datos.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controlador {

    private final HashMap<String, String> mapaUsuarios = new HashMap<>();
    private final HashMap<String, String> mapaPublicaciones = new HashMap<>();
    public static ArrayList<Publicacion> listaPublicaciones = new ArrayList<Publicacion>();

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
        //Algoritmo de anderson!
    }

    //opciones de usuario
    public static void iniciarSesion() {
    }

    public static void registrar() {
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
