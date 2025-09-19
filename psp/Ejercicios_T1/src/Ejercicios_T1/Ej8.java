package Ejercicios_T1;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nMes;

        System.out.print("Ingrese un numero de mes (1-12): ");
        nMes = sc.nextInt();

        if (nMes == 1) System.out.println("Enero");
        if (nMes == 2) System.out.println("Febrero");
        if (nMes == 3) System.out.println("Marzo");
        if (nMes == 4) System.out.println("Abril");
        if (nMes == 5) System.out.println("Mayo");
        if (nMes == 6) System.out.println("Junio");
        if (nMes == 7) System.out.println("Julio");
        if (nMes == 8) System.out.println("Agosto");
        if (nMes == 9) System.out.println("Septiembre");
        if (nMes == 10) System.out.println("Octubre");
        if (nMes == 11) System.out.println("Noviembre");
        if (nMes == 12) System.out.println("Diciembre");
    }
}
