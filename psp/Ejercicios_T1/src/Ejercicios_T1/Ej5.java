package Ejercicios_T1;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print("Ingrese un numero (1): ");
            n1 = sc.nextInt();
            System.out.print("Ingrese un numero (2): ");
            n2 = sc.nextInt();
        } while (n1 != n2);
    }
}
