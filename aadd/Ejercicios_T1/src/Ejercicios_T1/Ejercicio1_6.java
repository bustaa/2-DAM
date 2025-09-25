package Ejercicios_T1;
import java.io.File;

public class Ejercicio1_6 {
    public static void main(String args[]) {
        File directorio = new File(args[0]);
        String[] ficheros;

        if (args.length > 1) {
            FiltroExtension filtro = new FiltroExtension(args[1]);
            ficheros = directorio.list(filtro);
        } else {
            ficheros = directorio.list();
        }

        for (String e : ficheros) {
            System.out.println(e);
        }
    }
}
