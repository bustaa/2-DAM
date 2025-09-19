package Ejercicios_T1;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tCent, tFahr;

        System.out.print("Ingrese la temperatura (cº): ");
        tCent = sc.nextDouble();
        tFahr = (tCent * 9 / 5) + 32;

        System.out.println("Temperatura en Fahrenheit (ºF): " + tFahr);
    }
}
