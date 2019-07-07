package logica;

import datos.*;

public class Ejecucion {

    public static void main(String[] args) throws InterruptedException {
         /*++++++++++INICIO DE SESION Y REGISTRO++++++++++*/
        Controlador.registrar();
        Controlador.iniciarSesion();
        /*++++++++++++++++++++++++++++++++++++++++++++++++*/

        Usuario temp1 = new Usuario("temp1", "temp1", "love01", true);
        Usuario temp2 = new Usuario("temp2", "temp2", "love01", true);
        
        Publicacion.inicializarPublicaciones();
        //temp1.agregarPublicacion();
        temp1.eliminarPublicacion();
        temp1.editarPublicacion();
    }
}
