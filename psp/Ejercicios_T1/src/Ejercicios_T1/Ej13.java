package Ejercicios_T1;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tCent, tFahr;

        System.out.print("Ingrese la temperatura (cº): ");
        tCent = sc.nextDouble();
        tFahr = (tCent * 9 / 5) + 32;
        DecimalFormat nFormat = new DecimalFormat("#.00");

        System.out.println("Temperatura en Fahrenheit (ºF): " + nFormat.format(tFahr));
    }
}
