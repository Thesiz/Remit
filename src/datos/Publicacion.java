package datos;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import logica.*;

public class Publicacion implements Serializable {

    private Categoria categoria;
    private Usuario usuario;
    private Date fecha;
    private String titulo;
    private String descripcion;
    private Image imagen;
    private Administrador administrador;

    public Publicacion(Categoria categoria, Usuario usuario, Date fecha, String titulo, String descripcion) {
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
    
    public Publicacion(Categoria categoria, Administrador admin, Date fecha, String titulo, String descripcion) {
        this.categoria = categoria;
        this.administrador = admin;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }
    
    public Publicacion(Categoria categoria, Administrador admin, Date fecha, String titulo, String descripcion, Image imagen) {
        this.categoria = categoria;
        this.administrador = admin;
        this.fecha = fecha;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public static void inicializarPublicaciones() {
        Controlador.listaPublicaciones = Archivo.leerPublicaciones();
    }

    @Override
    public String toString() {
        String publicacion = "Titulo: " + this.titulo + "\nFecha de publicacion: " + this.fecha
                + "\nCategoria: " + this.categoria + "\nDescripcion: " + this.descripcion;
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
