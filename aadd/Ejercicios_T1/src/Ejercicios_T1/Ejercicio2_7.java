package Ejercicios_T1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nom del fitxer on vols guardar el text: ");
        String nomFitxer = sc.nextLine();

        File fitxer = new File(nomFitxer);

        try (BufferedWriter escriptor = new BufferedWriter(new FileWriter(fitxer))) {
            System.out.println("Escriu les línies de text (escriu 'exit' per finalitzar):");

            while (true) {
                System.out.print("> ");
                String entrada = sc.nextLine();

                if (entrada.equalsIgnoreCase("exit")) {
                    break; // condició de finalització
                }

                escriptor.write(entrada);
                escriptor.newLine(); // salt de línia
            }

            System.out.println("Les dades s'han guardat en: " + fitxer.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error d'E/S: " + e.getMessage());
        }

        sc.close();
    }
}
