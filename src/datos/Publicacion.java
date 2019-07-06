package datos;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import logica.*;

public class Publicacion implements ControladorCRUD, Serializable {

    private Categoria categoria;
    private Usuario usuario;
    private Date fecha;
    private String titulo;
    private String descripcion;
    private Image imagen;

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

    public void inicializarPublicaciones() {
        Controlador.listaPublicaciones = Archivo.leerPublicaciones();
    }

    /*crear
        1. Seleccionar categoria
        2. Pedir titulo, descripcion y foto
            a. Remit 
                i. Añadir a misPublicaciones y listaPublicaciones
                ii. Regresar al menu de suuario
            b. Cancelar
                i. Regresar al menu de usuario
     */
    @Override
    public void agregar() {
        Archivo.leerPublicaciones();
        Scanner entrada = new Scanner(System.in);
        boolean prueba = true;
        Usuario usuario = this.usuario;
        System.out.println("Selecciona la categoría de tu publicación: \n1. Tutorias"
                + "\n2. Evento Estudiantil\n3. Grupo de estudio autonomo\n4. Venta y/o servicio"
                + "");
        Categoria categoria = null;
        do {
            try {
                int opcion = entrada.nextInt();
                prueba = false;
                if (opcion == 1) {
                    categoria = new Categoria("Tutoria", 01);
                } else if (opcion == 2) {
                    categoria = new Categoria("Evento Estudiantil", 03);
                } else if (opcion == 3) {
                    categoria = new Categoria("Grupo de estudio autonomo", 04);
                } else if (opcion == 4) {
                    categoria = new Categoria("Venta y/o servicio", 05);
                }
                ExcepcionIntervalo.verificaRango(opcion, 1, 4);
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());;
                prueba = true;
            }
        } while (prueba);
        entrada.nextLine();
        System.out.println("Ingresa el título de tu publicación: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingresa la descripción de tu publicación: ");
        String descripcion = entrada.nextLine();
        Date fechaPub = new Date();
        System.out.println("1. Remit \n2. Cancelar");
        do {
            try {
                int opcion = entrada.nextInt();
                prueba = false;
                if (opcion == 1) {
                    Publicacion nuevaPublicacion = new Publicacion(categoria, usuario, fechaPub, titulo, descripcion);
                    Usuario.agregarPublicacion(nuevaPublicacion);
                    Controlador.listaPublicaciones.add(nuevaPublicacion);
                    Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
                } else if (opcion == 2) {
                    System.out.println("Aqui va el menu de usuario");
                    //menu usuario
                }
                ExcepcionIntervalo.verificaRango(opcion, 1, 4);
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());
                prueba = true;
            }
        } while (prueba);
    }

    @Override
    public void ver() {
    }

    @Override
    public void actualizar() {

    }

    @Override
    public void eliminar() {
        boolean prueba = true;
        int i = 0, contador = 0;
        Scanner entrada = new Scanner (System.in);
        for (Publicacion elemento : Controlador.listaPublicaciones) {
                System.out.println(i++ + ". " + elemento);
                contador++;
            }
        System.out.print("Selecciona la publicacion que deseas eliminar: ");
        do {
            try{
               int opcion = entrada.nextInt();
               prueba = false;
               ExcepcionIntervalo.verificaRango(opcion, 1, contador);
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());
                prueba = true;
            }
            
        } while (prueba);
        
    }

    @Override
    public String toString() {
        String publicacion = "Titulo: " + this.titulo + "\nFecha de publicacion: " + this.fecha
                + "\nCategoria: " + this.categoria + "\nDescripcion: " + this.descripcion;
        return publicacion;
    }
}
