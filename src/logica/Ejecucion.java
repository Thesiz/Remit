package logica;

import datos.*;

public class Ejecucion {

    public static void main(String[] args) {

        Usuario temp = new Usuario("temp", "temp", "love01", true);

        Publicacion.inicializarPublicaciones();
        //prueba.agregar();
        temp.eliminarPublicacion(temp);
        temp.editarPublicacion(temp);

    }
}
