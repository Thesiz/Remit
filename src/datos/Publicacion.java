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
    private String nombreImagen;

    public Publicacion(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion) {
        this.id = contadorId++;
        this.categoria = categoria;
        this.usuario = usuario;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nombreImagen =  null;
    }

    public Publicacion(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion, String nombreImagen) {
        this.id = contadorId++;
        this.categoria = categoria;
        this.usuario = usuario;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.nombreImagen = nombreImagen;
    }

    @Override
    public String toString() {

        String publicacion = "ID: " + this.id + "\nFECHA DE PUBLICACION:   " + this.fecha
                + "\nCATEGORIA:              " + this.categoria
                + "\nTITULO:                 " + this.titulo
                + "\nDESCRIPCION:            " + this.descripcion
                + "\nAUTOR:                  @" + this.usuario.getUsuario()
                +"IMAGEN:                     "+ this.nombreImagen
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

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Publicacion.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreImagen() {
        return nombreImagen;
    }

    public void setNombreImagen(String nombreImagen) {
        this.nombreImagen = nombreImagen;
    }

    
}
