package Ejercicios_T1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        File fichero, ficheroCopia;

        System.out.print("Introduce la ruta del fichero: ");
        fichero = new File(sc.next());
        ficheroCopia = new File(fichero.getPath());
        System.out.println(fichero.getPath());

        try {
            if (ficheroCopia.createNewFile()) {
                System.out.println("Fichero creado correctamente");
            } else {
                System.out.println("No se ha podido crear el fichero");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
