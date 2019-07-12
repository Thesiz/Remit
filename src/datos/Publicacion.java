package datos;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;

public class Publicacion implements Serializable {

    private static int contadorId = 1001;
    private int id;
    private Categoria categoria;
    private Usuario usuario;
    private Date fecha;
    private String titulo;
    private String descripcion;
    private Image imagen;

    public Publicacion(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion) {
        this.id = contadorId++;
        this.categoria = categoria;
        this.usuario = usuario;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Publicacion(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion, Image imagen) {
        this.categoria = categoria;
        this.usuario = usuario;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    @Override
    public String toString() {

        String publicacion = "ID: " + this.id + "\nFECHA DE PUBLICACION:   " + this.fecha
                + "\nCATEGORIA:              " + this.categoria
                + "\nTITULO:                 " + this.titulo
                + "\nDESCRIPCION:            " + this.descripcion
                + "\nAUTOR:                  @" + this.usuario.getUsuario()
                + "\n---------------------------------\n";

        return publicacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

}
