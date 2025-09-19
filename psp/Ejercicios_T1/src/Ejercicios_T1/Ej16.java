package Ejercicios_T1;
import java.util.Scanner;

public class Ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diaNac, nSuerte;

        System.out.print("Ingrese su dia de nacimiento: ");
        diaNac = sc.nextInt();
        nSuerte = (diaNac % 3) * 7 / 3 + diaNac * 2 / 3;

        System.out.println("Su numero de la suerte es: " + nSuerte);
    }
}
