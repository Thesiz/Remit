package logica;

import datos.*;
import gui.GuiVentanaPrincipal;

public class Ejecucion {

    /*public static void main(String[] args) throws InterruptedException {

        Controlador manager = new Controlador();
        //Si usuario esta activo -> mostar menu unuuario con sesion uniciada en esta linea

        Categoria tutorias = new Categoria("Tutoria", 1);
        Categoria institucionales = new Categoria("Evento Institucional", 2);
        Categoria estudiantiles = new Categoria("Evento Estudiantil", 3);
        Categoria gruposDeEstudios = new Categoria("Grupo de estudio autonomo", 4);
        Categoria ventaServicios = new Categoria("Venta y/o servicio", 5);

        Usuario usuarioA = new Usuario("Pepito Perez", "perecito", "perecito16", false);
        Administrador admin = new Administrador("El Remitente", "admin", "102030", false);

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

        boolean play = true;
        while (play) {
            if (admin.getActivo()) {
                //vistaAdmin
                VentanaPrincipal.menuUsuario();
                switch (VentanaPrincipal.pedirOpcion(1, 12)) {

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
                        Controlador.cerrarSesion(admin);

                        break;
                    case 8:
                        Controlador.remit(admin);
                        break;
                    case 9:
                        manager.buscar();
                        break;
                    case 10:
                        play = false;
                        break;
                    case 11:
                        manager.mostrarTodasPublicaciones();
                        break;
                    case 12:
                        //inflar con Mi Perfil
                        Controlador.miPerfil(admin);

                        break;
                }
            }

            boolean isActivo = false;
            Usuario usuarioIngresado = null;
            for (Usuario elemento : Controlador.listaUsuarios) {

                if (elemento.getActivo() == true) {

                    usuarioIngresado = elemento;
                    isActivo = true;
                }

            }

            if (isActivo) {
                System.out.println("Sesion iniciada!");
                System.out.println("Hola " + usuarioIngresado.getNombre());
                //vistaUsuario
                VentanaPrincipal.menuUsuario();
                switch (VentanaPrincipal.pedirOpcion(1, 12)) {

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
                        Controlador.cerrarSesion(usuarioIngresado);

                        break;
                    case 8:
                        Controlador.remit(usuarioIngresado);
                        break;
                    case 9:
                        manager.buscar();
                        break;
                    case 10:
                        play = false;
                        break;
                    case 11:
                        manager.mostrarTodasPublicaciones();
                        break;
                    case 12:
                        //inflar con Mi Perfil
                        Controlador.miPerfil(usuarioIngresado);

                        break;
                }

            } else {
                //vistaInvitado
                VentanaPrincipal.menuPrincipal();
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
                        Controlador.iniciarSesion();
                        //hacer verificacion, si los datos son validos, activo = true y
                        //el menu a mostrar es el Menu Usuario
                        break;
                    case 8:
                        Controlador.registrar();
                        break;
                    case 9:
                        manager.buscar();
                        break;
                    case 10:
                        play = false;
                        break;
                    case 11:
                        manager.mostrarTodasPublicaciones();
                        break;
                    case 999:
                        //LOGICA POR TERMINAR...
                        manager.accesoAdministrador(admin);
                        break;

                }
            }

        }

        /* Usuario temp1 = new Usuario("temp1", "temp1", "love01", true);
        Usuario temp2 = new Usuario("temp2", "temp2", "love01", true);
        
        Publicacion.inicializarPublicaciones();
        //temp1.agregarPublicacion();
        temp1.eliminarPublicacion();
        temp1.editarPublicacion();*/
    //}
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Anderson", "anvargasa", "holamundo", false);
        Usuario usuario2 = new Usuario("Jennifer", "jibarra", "holamundo2", false);
        Usuario usuario3 = new Usuario("Paulino Acuña", "pacuna", "123456", false);
        GuiVentanaPrincipal.main(args);

    }
}
