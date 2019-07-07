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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}
