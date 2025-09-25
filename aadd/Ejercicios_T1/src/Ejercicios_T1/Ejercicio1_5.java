package Ejercicios_T1;
import java.io.File;

public class Ejercicio1_5 {
    public static void main(String args[]) {
        File directorio = new File(args[0]);
        FiltroExtension filtro = new FiltroExtension(args[1]);

        String[] ficheros = directorio.list(filtro);

        for (String e : ficheros) {
            System.out.println(e);
        }
    }
}
