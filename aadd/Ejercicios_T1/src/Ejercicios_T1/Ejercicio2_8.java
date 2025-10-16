package Ejercicios_T1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio2_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Format de data i hora (exemple: 2025-10-16_14-30-55)
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());

        System.out.print("Introdueix un nom base per al fitxer: ");
        String nomBase = sc.nextLine();

        // Nom final del fitxer amb data i hora
        String nomFitxer = nomBase + "_" + timestamp + ".txt";
        File fitxer = new File(nomFitxer);

        try (BufferedWriter escriptor = new BufferedWriter(new FileWriter(fitxer))) {
            System.out.println("Escriu les línies de text (escriu 'exit' per finalitzar):");

            while (true) {
                System.out.print("> ");
                String entrada = sc.nextLine();

                if (entrada.equalsIgnoreCase("exit")) {
                    break;
                }

                escriptor.write(entrada);
                escriptor.newLine();
            }

            System.out.println("Fitxer creat correctament: " + fitxer.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error d'E/S: " + e.getMessage());
        }

        sc.close();
    }
}
