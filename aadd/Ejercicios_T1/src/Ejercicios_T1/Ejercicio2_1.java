package Ejercicios_T1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Error");
            return;
        }

        String ruta = args[0];
        File fitxer = new File(ruta);

        if (!fitxer.exists() || !fitxer.isFile()) {
            System.out.println("Error: el fitxer no existeix o la ruta no és vàlida.");
            return;
        }

        try {
            FileReader lector = new FileReader(fitxer);
            int caracter;
            while ((caracter = lector.read()) != -1) {
                System.out.print((char) caracter);
            }
            System.out.println("\n\n-- Fin del fichero --");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
