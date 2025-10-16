package Ejercicios_T1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_5 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Ús correcte: java LligFitxerLiniaALiniaAmbVelocitat <ruta_fitxer> <milisegons>");
            System.out.println("Exemple: java LligFitxerLiniaALiniaAmbVelocitat text.txt 500");
            return;
        }

        String ruta = args[0];
        File fitxer = new File(ruta);

        if (!fitxer.exists() || !fitxer.isFile()) {
            System.out.println("Error: el fitxer no existeix o la ruta no és vàlida.");
            return;
        }

        int velocitat;
        try {
            velocitat = Integer.parseInt(args[1]);
            if (velocitat < 0) {
                System.out.println("La velocitat ha de ser un nombre positiu.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: la velocitat ha de ser un nombre enter (en milisegons).");
            return;
        }

        try (BufferedReader lector = new BufferedReader(new FileReader(fitxer))) {
            String linia;
            while ((linia = lector.readLine()) != null) {
                System.out.println(linia);
                Thread.sleep(velocitat); // pausa entre línies
            }
            System.out.println("\n-- Fi del fitxer --");
        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El programa s'ha interromput.");
        }
    }
}
