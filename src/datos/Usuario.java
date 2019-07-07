package datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import logica.*;

public class Usuario extends Persona{
    private boolean activo;
    private static ArrayList<Publicacion> misPublicaciones = new ArrayList <>();

    public Usuario(String nombre, String usuario, String contraseña, boolean activo) {
        super(nombre, usuario, contraseña);
        this.activo = activo;
        Controlador.listaUsuarios.add(this);
        Controlador.mapaUsuarios.put(usuario, this);
    }

    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public boolean getActivo(){
        return this.activo;
    }

    public static void agregarPublicacion (Publicacion publicacion){
        misPublicaciones.add(publicacion);
    }
    
    public static ArrayList<Publicacion> getMisPublicaciones() {
        return misPublicaciones;
    }

    public void setMisPublicaciones(ArrayList<Publicacion> misPublicaciones) {
        this.misPublicaciones = misPublicaciones;
    }
    
    public static ArrayList<Publicacion> encontrarMisPublicaciones (Usuario temp){
        ArrayList<Publicacion> temporal = new ArrayList<>();
        int i = 0;
        for (Publicacion elemento : Controlador.listaPublicaciones){
            Usuario user = elemento.getUsuario();
            String usuario = user.getUsuario();
            if (usuario.equals(temp.getUsuario())){
                System.out.println(++i + ". " + elemento);
                temporal.add(elemento);
            }
        }
        return temporal;
    }
    
    public void agregarPublicacion(Usuario usuario) {
        Archivo.leerPublicaciones();
        Scanner entrada = new Scanner(System.in);
        boolean prueba = true;
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

    
    public void ver() {
        int i = 0;
        for (Publicacion elemento : Controlador.listaPublicaciones) {
            System.out.println(++i + ". " + elemento);
        }
    }

    
    public void editarPublicacion(Usuario usuario) {
        boolean prueba = true;
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);
        Usuario.encontrarMisPublicaciones(usuario);
        int maximo = (Usuario.encontrarMisPublicaciones(usuario).size());
        System.out.print("Selecciona la publicacion que deseas editar: ");
        do {
            try {
                opcion = entrada.nextInt();
                prueba = false;
                ExcepcionIntervalo.verificaRango(opcion, 1, maximo);
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());
                prueba = true;
            }

        } while (prueba);
        Publicacion publicacionEditar = Controlador.listaPublicaciones.get(opcion - 1);
        prueba = true;
        System.out.println("Selecciona el campo que deseas editar (si son varios, separalos con ',' , '.' ,'-' o '/')"
                + "\n1. Título \t2. Categoría \t3. Descripción");
        String sOpciones = null;
        StringTokenizer separador = null;
        int opcionesVal[] = null;
        do {

            sOpciones = entrada.nextLine();
            separador = new StringTokenizer(sOpciones, ",.-/");
            opcionesVal = new int[separador.countTokens()];
            int posicionArray = 0;
            while (separador.hasMoreTokens()) {
                try {
                    opcionesVal[posicionArray] = Integer.parseInt(separador.nextToken());
                    ExcepcionIntervalo.verificaRango(opcionesVal[posicionArray], 1, 3);
                    posicionArray++;
                    prueba = false;
                } catch (InputMismatchException e) {
                    System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                    prueba = true;
                } catch (ExcepcionIntervalo e) {
                    System.err.println(e.getMessage());
                    prueba = true;
                } catch (NumberFormatException e) {
                    System.out.println("Has ingresado un caracter invalido para separar las opciones. Intentalo nuevamente");
                    prueba = true;
                }
            }
        } while (prueba);
        Categoria categoria = null;
        String titulo = null, descripcion = null;
        for (opcion = 0; opcion < opcionesVal.length; opcion++) {
            switch (opcionesVal[opcion]) {
                case 1:
                    System.out.println("EDITAR TITULO: \nTítulo actual: " + publicacionEditar.getTitulo());
                    System.out.println("Ingresa el nuevo título de tu publicación: ");
                    titulo = entrada.nextLine();
                    publicacionEditar.setTitulo(titulo);
                    System.out.println("Título editado exitosamente: " + publicacionEditar.getTitulo());
                    break;

                case 2:
                    boolean pruebaCg = true;
                    System.out.println("Selecciona la categoría de tu publicación: \n1. Tutorias"
                            + "\n2. Evento Estudiantil\n3. Grupo de estudio autonomo\n4. Venta y/o servicio"
                            + "");
                    do {
                        try {
                            int opcionCat = entrada.nextInt();
                            pruebaCg = false;
                            if (opcionCat == 1) {
                                categoria = new Categoria("Tutoria", 01);
                            } else if (opcionCat == 2) {
                                categoria = new Categoria("Evento Estudiantil", 03);
                            } else if (opcionCat == 3) {
                                categoria = new Categoria("Grupo de estudio autonomo", 04);
                            } else if (opcionCat == 4) {
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
                    } while (pruebaCg);
                    break;
                case 3:
                    entrada.nextLine();
                    System.out.println("EDITAR DESCRIPCION: \nDescripcion actual: " + publicacionEditar.getDescripcion());
                    System.out.println("Ingresa la nueva descripcion de tu publicación: ");
                    descripcion = entrada.nextLine();
                    publicacionEditar.setDescripcion(descripcion);
                    System.out.println("Descrición editada exitosamente! " + publicacionEditar.getDescripcion());
                    break;
                /* case 4: PARA EDITAR LA IMAGEN (IMPLEMENTADO EN LA UI) 
                    
                 */
            }
        }
        
        publicacionEditar = new Publicacion(categoria, usuario, publicacionEditar.getFecha(), titulo, descripcion);
        System.out.println(publicacionEditar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);

    }

    
    public void eliminarPublicacion(Usuario usuario) {
        boolean prueba = true;
        int i = 0, contador = 0, opcion = 0;
        Scanner entrada = new Scanner(System.in);
        Usuario.encontrarMisPublicaciones(usuario);
        int maximo = (Usuario.encontrarMisPublicaciones(usuario).size());
        System.out.println(maximo);
        System.out.print("Selecciona la publicacion que deseas eliminar: ");
        do {
            try {
                opcion = entrada.nextInt();
                prueba = false;
                ExcepcionIntervalo.verificaRango(opcion, 1, maximo);
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());
                prueba = true;
            }
        } while (prueba);
        Publicacion publicacionEliminar = Controlador.listaPublicaciones.get(opcion - 1);
        Usuario.getMisPublicaciones().remove(publicacionEliminar);
        Controlador.listaPublicaciones.remove(publicacionEliminar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
        System.out.println("Publicacion eliminada");

    }

    
}
