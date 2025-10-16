package Ejercicios_T1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Ús correcte: java LligFitxerEnBlocs <ruta_fitxer> <nombre_caracters>");
            System.out.println("Exemple: java LligFitxerEnBlocs text.txt 100");
            return;
        }

        String ruta = args[0];
        File fitxer = new File(ruta);

        if (!fitxer.exists() || !fitxer.isFile()) {
            System.out.println("Error: el fitxer no existeix o la ruta no és vàlida.");
            return;
        }

        int tamanyBloc;
        try {
            tamanyBloc = Integer.parseInt(args[1]);
            if (tamanyBloc <= 0) {
                System.out.println("El nombre de caràcters ha de ser positiu.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: el nombre de caràcters ha de ser un número enter.");
            return;
        }

        try (FileReader lector = new FileReader(fitxer);
             Scanner sc = new Scanner(System.in)) {

            char[] buffer = new char[tamanyBloc];
            int llegits;

            while ((llegits = lector.read(buffer)) != -1) {
                // Mostra només els caràcters llegits (pot ser menys de tamanyBloc a l'últim bloc)
                System.out.print(new String(buffer, 0, llegits));
                System.out.println("\n\n--- Prem [Enter] per continuar ---");
                sc.nextLine(); // Espera que l'usuari prema una tecla
            }

            System.out.println("\n-- Fi del fitxer --");

        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer: " + e.getMessage());
        }
    }
}
