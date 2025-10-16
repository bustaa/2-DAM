package Ejercicios_T1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_4 {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Ús correcte: java LligFitxerLiniaALinia <ruta_fitxer>");
            System.out.println("Exemple: java LligFitxerLiniaALinia text.txt");
            return;
        }

        String ruta = args[0];
        File fitxer = new File(ruta);

        if (!fitxer.exists() || !fitxer.isFile()) {
            System.out.println("Error: el fitxer no existeix o la ruta no és vàlida.");
            return;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(fitxer))) {
            String linia;
            while ((linia = lector.readLine()) != null) {
                System.out.println(linia);
            }
            System.out.println("\n-- Fi del fitxer --");
        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        }
    }
}
