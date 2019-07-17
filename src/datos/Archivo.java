
package datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Archivo implements Serializable{
    
    public static ArrayList<Publicacion> leerPublicaciones (){
        File archivo = new File ("listaPublicaciones.txt").getAbsoluteFile();
        FileInputStream lector = null;
        ObjectInputStream decodificador = null;
        ArrayList<Publicacion> publicaciones = new ArrayList<>();
        try {
            lector = new FileInputStream(archivo);
            decodificador = new ObjectInputStream(lector);
            publicaciones = (ArrayList<Publicacion>) decodificador.readObject();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return publicaciones;
    }
    
    public static void guardarPublicaciones(ArrayList<Publicacion> publicaciones){
        File archivo = new File("listaPublicaciones.txt").getAbsoluteFile();
        FileOutputStream escritor = null;
        ObjectOutputStream encriptador = null;
        try {
            archivo.createNewFile();
            escritor = new FileOutputStream(archivo);
            encriptador = new ObjectOutputStream(escritor);
            encriptador.writeObject(publicaciones);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        finally{
            if(escritor != null){
                try {
                    escritor.close();
                    if(escritor != null){
                        escritor.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
    
    public static ArrayList<Usuario> leerUsuarios (){
        File archivo = new File ("listaUsuarios.txt").getAbsoluteFile();
        FileInputStream lector = null;
        ObjectInputStream decodificador = null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            lector = new FileInputStream(archivo);
            decodificador = new ObjectInputStream(lector);
            usuarios = (ArrayList<Usuario>) decodificador.readObject();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex.getMessage());
        }
        return usuarios;
    }
    
    public static void guardarUsuarios(ArrayList<Usuario> usuarios){
       File archivo = new File("listaUsuarios.txt").getAbsoluteFile();
        FileOutputStream escritor = null;
        ObjectOutputStream encriptador = null;
        try {
            archivo.createNewFile();
            escritor = new FileOutputStream(archivo);
            encriptador = new ObjectOutputStream(escritor);
            encriptador.writeObject(usuarios);
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        finally{
            if(escritor != null){
                try {
                    escritor.close();
                    if(escritor != null){
                        escritor.close();
                    }
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
            }
        }
    }
    
}
