package datos;

import java.io.Serializable;

public class Categoria implements Serializable {

    private String nombre;
    private int codigo;

    public Categoria(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    @Override
    public String toString (){
        String categoria = this.nombre;
        return categoria;
    }
    
}
