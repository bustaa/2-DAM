package Ejercicios_T1;
import java.io.File;
import java.util.Scanner;

public class Ejercicio1_4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        String ruta;

        System.out.print("Introduce la ruta del directorio: ");
        ruta = teclado.nextLine();

        File directorio = new File(ruta);

        if (directorio.exists()) {
            System.out.println("El directorio existe.");
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
