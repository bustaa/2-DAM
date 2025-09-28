package Ejercicios_T1;

import java.util.Scanner;

public class Ej38 {
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void mostrarIntervaloConPrimos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número inicial del intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Introduce el número final del intervalo: ");
        int fin = sc.nextInt();

        long tiempoInicio = System.currentTimeMillis();

        System.out.println("\nNúmeros del intervalo y si son primos:");
        for (int i = inicio; i <= fin; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " -> Primo");
            } else {
                System.out.println(i + " -> No primo");
            }
        }

        long tiempoFin = System.currentTimeMillis();
        System.out.println("\nTiempo de ejecución: " + (tiempoFin - tiempoInicio) + " ms");
    }

    public static void main(String[] args) {
        mostrarIntervaloConPrimos();
    }
}
