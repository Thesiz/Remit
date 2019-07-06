package logica;

import datos.*;

public class Ejecucion {

    public static void main(String[] args) {

        Usuario temp = new Usuario("temp", "temp", "love01", true);
        Publicacion prueba = new Publicacion(null, temp, null, null, null);

        prueba.inicializarPublicaciones();
        //prueba.agregar();
        prueba.eliminar();
        prueba.actualizar();

    }
}
