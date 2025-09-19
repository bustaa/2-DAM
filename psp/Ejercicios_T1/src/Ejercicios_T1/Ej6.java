package Ejercicios_T1;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaTotal = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un numero: ");
            sumaTotal +=  sc.nextInt();
        }

        System.out.println("Resultado: " + sumaTotal);
    }
}
