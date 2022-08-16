package EjerciciosTema1;


import java.util.ArrayList;
import java.util.List;

public class EjercicioTema1 {
    public static void main(String[] args) {

        List<String> tiposDeDatos = new ArrayList<>();
            System.out.println("");
            System.out.println("Tipos de datos:");
            tiposDeDatos.add("Numericos (byte, short, long, int, double, float)");
            tiposDeDatos.add("Boolean (true, false)");
            tiposDeDatos.add("Texto (char, String)");
        for (String tipo : tiposDeDatos){
            System.out.println(tipo);
        }






        /*

        1- Numerico
         a- Entero (byte, int, long, short)
         b- Decimal (double, float)
        2- Boolean (false, true)
        3- Texto (char,String)
         */



    }
}

