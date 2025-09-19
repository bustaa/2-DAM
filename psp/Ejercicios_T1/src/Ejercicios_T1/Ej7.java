package Ejercicios_T1;
import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaTotal, totalNums;
        sumaTotal = 0;
        totalNums = 0;

        while (totalNums < 5) {
            System.out.print("Ingrese un numero: ");
            sumaTotal += sc.nextInt();
            totalNums++;
        }

        System.out.println("Resultado: " + sumaTotal);
    }
}

