package iu;

import datos.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VentanaPrincipal {

    public static void menuPrincipal() {
        System.out.println("Bienvenido a Remit! Sistema de Informacion Universitaria");

        System.out.println("MENÚ PRINCIPAL:\n"
                + "1. Ver Publicaciones de tipo Tutorias\n"
                + "2. Ver Publicaciones de tipo Eventos Institucionales\n"
                + "3. Ver Publicaciones de tipo Eventos Estudiantiles\n"
                + "4. Ver Publicaciones de tipo Grupo De Estudio Autonomo\n"
                + "5. Ver Publicaciones de tipo Ventas y Servicios\n"
                + "6. Ver Calendario Academico\n"
                + "---------------------------------\n"
                + "7. Iniciar Sesion\n"
                + "8. Registrarse\n"
                + "9. Buscar Publicacion\n"
                + "10. Salir\n "
                + "11. Ver todas las Publicaciones\n "
                + "---------------------------------\n"
        //99. Admin Access
        );
    }

    public static int pedirOpcion(int min, int max) {
        Scanner lectura = new Scanner(System.in);
        int opcion = 0;
        boolean prueba = true;

        do {
            System.out.print("\nSeleccione una opción: ");
            try {
                prueba = false;
                opcion = lectura.nextInt();
                ExcepcionIntervalo.verificaRango(opcion, min, max);
            } catch (InputMismatchException e) {
                lectura.next();
                prueba = true;
                System.out.println("\nERROR!!! Ha ingresado un caracter no válido.\nInténtelo nuevamente.");
            } catch (ExcepcionIntervalo ex) {
                prueba = true;
                System.out.println(ex.getMessage());
            }
        } while (prueba);
        return opcion;
    }

    public void mostrarPublicaciones() {
    }

    ;
    public void filtrarPublicaciones(Categoria categoria) {
    }

    ;
    public void buscarPublicacion(String palabrasClave) {
    }
;
}
