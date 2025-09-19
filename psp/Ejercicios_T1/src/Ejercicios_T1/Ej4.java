package Ejercicios_T1;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, nMayor, nMenor;
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Los dos numeros son iguales");
        } else {
            if (n1 > n2) {
                nMayor = n1;
                nMenor = n2;
            } else {
                nMayor = n2;
                nMenor = n1;
            }
            System.out.println("Numero mayor: " + nMayor);
            System.out.println("Numero mayor: " + nMenor);
        }
    }
}
