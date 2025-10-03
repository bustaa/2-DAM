package Ejercicios_T1;

import java.util.Scanner;

public class Ej36 {
    public static int pedirNumerosYSumar() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número entero: ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];
        }

        System.out.println("Números en orden inverso:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        return suma;
    }

    public static void main(String[] args) {
        int total = pedirNumerosYSumar();
        System.out.println("Suma total: " + total);
    }
}
