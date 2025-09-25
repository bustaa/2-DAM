package Ejercicios_T1;
import java.io.File;

public class Ejercicio1_7 {
    public static void main(String args[]) {
        File directorio = new File(args[0]);
        String[] ficheros;
        int nExtensiones = args.length - 1;

        for (int i = 1; i < nExtensiones; i++) {
            FiltroExtension filtro = new FiltroExtension(args[i]);
            ficheros = directorio.list(filtro);
            for (String e : ficheros) {
                System.out.println(e);
            }
        }
    }
}
