package Ejercicios_T1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio2_6 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Ús correcte: java CopiaFitxerLiniaALinia <ruta_fitxer> <milisegons>");
            System.out.println("Exemple: java CopiaFitxerLiniaALinia text.txt 500");
            return;
        }

        String ruta = args[0];
        File fitxerOrigen = new File(ruta);

        if (!fitxerOrigen.exists() || !fitxerOrigen.isFile()) {
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

        // Nom del nou fitxer
        String nomNou = "copia_" + fitxerOrigen.getName();
        File fitxerDesti = new File(fitxerOrigen.getParent(), nomNou);

        try (BufferedReader lector = new BufferedReader(new FileReader(fitxerOrigen));
             BufferedWriter escriptor = new BufferedWriter(new FileWriter(fitxerDesti))) {

            String linia;
            while ((linia = lector.readLine()) != null) {
                escriptor.write(linia);
                escriptor.newLine();  // Escriu un salt de línia
                escriptor.flush();    // Assegura que s'escriga immediatament
                Thread.sleep(velocitat); // Retard entre línies
            }

            System.out.println("Fitxer copiat correctament a: " + fitxerDesti.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error d'E/S: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("El programa s'ha interromput.");
        }
    }
}
