package datos;
public class ExcepcionIntervalo extends Exception{
    
    @Override
    public String getMessage(){
        String salida = "\nERROR!!! La opción ingresada no existe\nInténtelo nuevamente.";
        return salida;
    }
    public static void verificaRango(int numero,int min,int max) throws ExcepcionIntervalo {
        if (numero < min || numero > max) {
            throw new ExcepcionIntervalo();
        }
    }
}
