package datos;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;
import logica.Controlador;

public class Administrador extends Usuario {

    public Administrador(String nombre, String apellido, String usuario, String contraseña, boolean activo) {
        super(nombre, apellido, usuario, contraseña, activo);
    }



    //@Override
    public void agregar() {
        Archivo.leerPublicaciones();
        Administrador admin = this;
        Publicacion nuevaPublicacion = null;
        Scanner entrada = new Scanner(System.in);
        boolean prueba = true;
        Categoria categoria = null;
        System.out.println("Selecciona la categoría de tu publicación: \n1. Tutorias"
                + "\n2. Evento institucional\n3. Evento Estudiantil\n4. Grupo de estudio autonomo\n5. Venta y/o servicio");
        do {
            try {
                int opcion = entrada.nextInt();
                prueba = false;
                if (opcion == 1) {
                    categoria = new Categoria("Tutoria", 01);
                } else if (opcion == 2) {
                    categoria = new Categoria("Evento Institucional", 02);
                } else if (opcion == 3) {
                    categoria = new Categoria("Evento Estudiantil", 03);
                } else if (opcion == 4) {
                    categoria = new Categoria("Grupo de estudio autonomo", 04);
                } else if (opcion == 5) {
                    categoria = new Categoria("Venta y/o servicio", 05);
                }
                //hay un error de logica
                nuevaPublicacion.setCategoria(categoria);
                ExcepcionIntervalo.verificaRango(opcion, 1, 5);
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());
                prueba = true;
            }
        } while (prueba);
        entrada.nextLine();
        System.out.println("Ingresa el título de tu publicación: ");
        String titulo = entrada.nextLine();
        nuevaPublicacion.setTitulo(titulo);
        System.out.println("Ingresa la descripción de tu publicación: ");
        String descripcion = entrada.nextLine();
        nuevaPublicacion.setDescripcion(descripcion);
        Date fechaPub = new Date();
        System.out.println("1. Remit \n2. Cancelar");
        do {
            try {
                int opcion = entrada.nextInt();
                prueba = false;
                if (opcion == 1) {
                    nuevaPublicacion = new Publicacion(categoria, admin, fechaPub, titulo, descripcion);
                    Usuario.agregarPublicacion(nuevaPublicacion);
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

//    @Override
    public void editar() {
        boolean prueba = true;
        int opcion = 0;
        Administrador admin = this;
        Scanner entrada = new Scanner(System.in);
        Usuario.verMisPublicaciones(admin);
        int maximo = Usuario.cantidadMisPublicaciones(admin);
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
        for (opcion = 0; opcion < opcionesVal.length; opcion++) {
            switch (opcionesVal[opcion]) {
                case 1:
                    System.out.println("EDITAR TITULO: \nTítulo actual: " + publicacionEditar.getTitulo());
                    System.out.println("Ingresa el nuevo título de tu publicación: ");
                    String titulo = entrada.nextLine();
                    publicacionEditar.setTitulo(titulo);
                    System.out.println("Título editado exitosamente: " + publicacionEditar.getTitulo());
                    break;

                case 2:
                    boolean pruebaCg = true;
                    System.out.println("EDITAR CATEGORIA: \nCategoría actual: " + publicacionEditar.getCategoria()
                            + "\nSelecciona la categoría de tu publicación: \n1. Tutorias"
                            + "\n2. Evento institucional\n3. Evento Estudiantil\n4. Grupo de estudio autonomo\n5. Venta y/o servicio");
                    do {
                        try {
                            int opcionCat = entrada.nextInt();
                            if (opcionCat == 1) {
                                categoria = new Categoria("Tutoria", 01);
                            } else if (opcionCat == 2) {
                                categoria = new Categoria("Evento Institucional", 02);
                            } else if (opcionCat == 3) {
                                categoria = new Categoria("Evento Estudiantil", 03);
                            } else if (opcionCat == 4) {
                                categoria = new Categoria("Grupo de estudio autonomo", 04);
                            } else if (opcionCat == 5) {
                                categoria = new Categoria("Venta y/o servicio", 05);
                            }
                            publicacionEditar.setCategoria(categoria);
                            pruebaCg = false;
                            ExcepcionIntervalo.verificaRango(opcionCat, 1, 5);
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
                    String descripcion = entrada.nextLine();
                    publicacionEditar.setDescripcion(descripcion);
                    System.out.println("Descrición editada exitosamente! " + publicacionEditar.getDescripcion());
                    break;
                /* case 4: PARA EDITAR LA IMAGEN (IMPLEMENTADO EN LA UI) 
                    
                 */
            }
        }
        publicacionEditar = new Publicacion(publicacionEditar.getCategoria(), admin, publicacionEditar.getFecha(), publicacionEditar.getTitulo(),
                publicacionEditar.getDescripcion());
        System.out.println(publicacionEditar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
    }
    
    //@Override
    public void eliminar() {
        boolean prueba = true;
        int i = 0, contador = 0, opcion = 0;
        Administrador admin = this;
        Scanner entrada = new Scanner(System.in);
        Usuario.verMisPublicaciones(admin);
        int maximo = Usuario.cantidadMisPublicaciones(admin);
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
        System.out.println("¿Seguro que deseas elminar la publicacion \"" + publicacionEliminar.getTitulo() + "\"?");
        Usuario.getMisPublicaciones().remove(publicacionEliminar);
        Controlador.listaPublicaciones.remove(publicacionEliminar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
        System.out.println("Publicacion eliminada");

    }
    
    public static void verTodasPublicaciones (){
        int i = 0;
        for (Publicacion elemento : Controlador.listaPublicaciones){
            System.out.println(++i + ". " + elemento);
        }
    }
    
    public static int cantidadPublicaciones (){
        int i = 0;
        ArrayList <Publicacion> temporal = new ArrayList<>();
        for (Publicacion elemento : Controlador.listaPublicaciones){
            temporal.add(elemento);
        }
        return temporal.size();
    }
    
    public void eliminarCualquierPub (){
        boolean prueba = true;
        int i = 0, contador = 0, opcion = 0;
        Administrador admin = this;
        Scanner entrada = new Scanner(System.in);
        Usuario.verMisPublicaciones(admin);
        System.out.print("Selecciona la publicacion que deseas eliminar: ");
        do {
            try {
                opcion = entrada.nextInt();
                prueba = false;
                ExcepcionIntervalo.verificaRango(opcion, 1, Administrador.cantidadPublicaciones());
            } catch (InputMismatchException e) {
                System.out.println("Has ingresado un caracter invalido. Intentalo nuevamente");
                prueba = true;
            } catch (ExcepcionIntervalo e) {
                System.err.println(e.getMessage());
                prueba = true;
            }
        } while (prueba);
        Publicacion publicacionEliminar = Controlador.listaPublicaciones.get(opcion - 1);
        System.out.println("¿Seguro que deseas elminar la publicacion \"" + publicacionEliminar.getTitulo() + "\"?");
        Usuario.getMisPublicaciones().remove(publicacionEliminar);
        Controlador.listaPublicaciones.remove(publicacionEliminar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
        System.out.println("Publicacion eliminada");
    }
    
    public void editarCualquierPub (){
        boolean prueba = true;
        int opcion = 0;
        Administrador admin = this;
        Scanner entrada = new Scanner(System.in);
        admin.verTodasPublicaciones();
        System.out.print("Selecciona la publicacion que deseas editar: ");
        do {
            try {
                opcion = entrada.nextInt();
                prueba = false;
                ExcepcionIntervalo.verificaRango(opcion, 1, Administrador.cantidadPublicaciones());
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
        for (opcion = 0; opcion < opcionesVal.length; opcion++) {
            switch (opcionesVal[opcion]) {
                case 1:
                    System.out.println("EDITAR TITULO: \nTítulo actual: " + publicacionEditar.getTitulo());
                    System.out.println("Ingresa el nuevo título de tu publicación: ");
                    String titulo = entrada.nextLine();
                    publicacionEditar.setTitulo(titulo);
                    System.out.println("Título editado exitosamente: " + publicacionEditar.getTitulo());
                    break;

                case 2:
                    boolean pruebaCg = true;
                    System.out.println("EDITAR CATEGORIA: \nCategoría actual: " + publicacionEditar.getCategoria()
                            + "\nSelecciona la categoría de tu publicación: \n1. Tutorias"
                            + "\n2. Evento institucional\n3. Evento Estudiantil\n4. Grupo de estudio autonomo\n5. Venta y/o servicio");
                    do {
                        try {
                            int opcionCat = entrada.nextInt();
                            if (opcionCat == 1) {
                                categoria = new Categoria("Tutoria", 01);
                            } else if (opcionCat == 2) {
                                categoria = new Categoria("Evento Institucional", 02);
                            } else if (opcionCat == 3) {
                                categoria = new Categoria("Evento Estudiantil", 03);
                            } else if (opcionCat == 4) {
                                categoria = new Categoria("Grupo de estudio autonomo", 04);
                            } else if (opcionCat == 5) {
                                categoria = new Categoria("Venta y/o servicio", 05);
                            }
                            publicacionEditar.setCategoria(categoria);
                            pruebaCg = false;
                            ExcepcionIntervalo.verificaRango(opcionCat, 1, 5);
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
                    String descripcion = entrada.nextLine();
                    publicacionEditar.setDescripcion(descripcion);
                    System.out.println("Descrición editada exitosamente! " + publicacionEditar.getDescripcion());
                    break;
                /* case 4: PARA EDITAR LA IMAGEN (IMPLEMENTADO EN LA UI) 
                    
                 */
            }
        }
        publicacionEditar = new Publicacion(publicacionEditar.getCategoria(), publicacionEditar.getUsuario(), 
                publicacionEditar.getFecha(), publicacionEditar.getTitulo(), publicacionEditar.getDescripcion());
        System.out.println(publicacionEditar);
        Archivo.guardarPublicaciones(Controlador.listaPublicaciones);
    }
    
    public void eliminarUsuario (Usuario usuario){
        
    }
}
