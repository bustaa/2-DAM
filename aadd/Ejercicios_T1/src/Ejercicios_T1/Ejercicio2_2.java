package Ejercicios_T1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2_2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error");
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
                System.out.println("La velocitat ha de ser un número positiu.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: la velocitat ha de ser un número enter.");
            return;
        }

        try {
            FileReader lector = new FileReader(fitxer);
            int caracter;
            while ((caracter = lector.read()) != -1) {
                System.out.print((char) caracter);
                System.out.flush();
                Thread.sleep(velocitat);
            }
            System.out.println("\n\n-- Fi del fitxer --");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("El programa s'ha interromput.");
        }
    }
}
