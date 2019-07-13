
package datos;

import java.util.Date;

public interface ControladorCRUD {
    
    void agregar(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion);
    void agregarPubImg (Categoria categoria, Usuario usuario, Date fecha, 
            String titulo, String descripcion, String nombreImg);
    
    void editar();

    void eliminar();
}
