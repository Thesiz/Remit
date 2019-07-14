
package datos;

import java.util.Date;

public interface ControladorCRUD {
    
    void agregar(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion);
    void agregar (Categoria categoria, Usuario usuario, Date fecha, 
            String titulo, String descripcion, String nombreImg);
    
    void editar(Publicacion publicacion, Usuario usuario);
    void editar(Publicacion publicacion, Usuario usuario, String nombreImg);

    void eliminar();
}
