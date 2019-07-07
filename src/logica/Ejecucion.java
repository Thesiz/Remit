package logica;

import iu.*;
import datos.*;
import java.util.Date;

import datos.*;

import datos.*;

public class Ejecucion {

    public static void main(String[] args) {
        
        

        Controlador manager = new Controlador();
        //Si usuario esta activo -> mostar menu unuuario con sesion uniciada en esta linea

        //pruebas de paulino
        Categoria tutorias = new Categoria("Tutoria", 1);
        Categoria institucionales = new Categoria("Evento Institucional", 2);
        Categoria estudiantiles = new Categoria("Evento Estudiantil", 3);
        Categoria gruposDeEstudios = new Categoria("Grupo de estudio autonomo", 4);
        Categoria ventaServicios = new Categoria("Venta y/o servicio", 5);

        Usuario usuarioA = new Usuario("Pepito Perez", "perecito", "perecito16", true);
        Date date = new Date();

        Publicacion publicacionB = new Publicacion(estudiantiles, usuarioA, date,
                "Publicacion de prueba estudiantiles ", "Esta es la descripcion");
        Publicacion publicacionC = new Publicacion(estudiantiles, usuarioA, date,
                "Publicacion de prueba estudiantiles", "Esta es la descripcion");

        Publicacion publicacionA = new Publicacion(tutorias, usuarioA, date,
                "Publicacion de prueba tutorias", "Esta es la descripcion");

        Publicacion publicacionD = new Publicacion(ventaServicios, usuarioA, date,
                "Publicacion de prueba ventaServicios", "Esta es la descripcion");
        Publicacion publicacionE = new Publicacion(gruposDeEstudios, usuarioA, date,
                "Publicacion de prueba gruposDeEstudios", "Esta es la descripcion");

        Controlador.listaPublicaciones.add(publicacionB);
        Controlador.listaPublicaciones.add(publicacionC);
        Controlador.listaPublicaciones.add(publicacionD);
        Controlador.listaPublicaciones.add(publicacionA);
        Controlador.listaPublicaciones.add(publicacionE);
        //fin pruebas de paulino

        boolean play = true;
        while (play) {

            VentanaPrincipal.menuPrincipal();

            //System.out.println(Controlador.listaPublicaciones);
            switch (VentanaPrincipal.pedirOpcion(1, 11)) {

                case 1:

                    manager.verTutorias();
                    break;
                case 2:

                    manager.verInstitucionales();
                    break;
                case 3:

                    manager.verEstudiantiles();
                    break;
                case 4:

                    manager.verGruposEstudio();
                    break;
                case 5:

                    manager.verVentasServicios();
                    break;
                case 6:

                    manager.calendario();
                    break;
                case 7:
                    //mostar iniciar sesion
                    Controlador.iniciarSesion();
                    break;
                case 8:
                    //mostar registrarse
                    Controlador.registrar();
                    break;
                case 9:

                    manager.buscar();
                    //mostar buscar

                    break;
                case 10:
                    play = false;
                    break;
                case 11:
                    manager.verTodasLasPublicaciones();
                    break;
                case 999:
                    //LOGICA POR TERMINAR...
                    manager.accesoAdministrador();
                    break;

            }
        }

        Usuario temp = new Usuario("temp", "temp", "love01", true);
        Publicacion prueba = new Publicacion(null, temp, null, null, null);

        prueba.inicializarPublicaciones();
        //prueba.agregar();
        prueba.eliminar();
        prueba.actualizar();

        prueba.inicializarPublicaciones();
        //prueba.agregar();
        prueba.eliminar();
        prueba.actualizar();

    }
}
