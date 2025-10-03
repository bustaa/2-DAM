package Ejercicios_T1;

import java.util.Scanner;

public class Ej37 {
    public static void mostrarNivelYSalario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tus años de experiencia: ");
        double años = sc.nextDouble();

        String nivelSalario;

        if (años < 1) {
            nivelSalario = "Desarrollador Junior L1 – 15000-18000";
        } else if (años >= 1 && años < 3) {
            nivelSalario = "Desarrollador Junior L2 – 18000-22000";
        } else if (años >= 3 && años < 5) {
            nivelSalario = "Desarrollador Senior L1 – 22000-28000";
        } else if (años >= 5 && años <= 8) {
            nivelSalario = "Desarrollador Senior L2 – 28000-36000";
        } else {
            nivelSalario = "Analista / Arquitecto. Salario a convenir en base al rol";
        }

        System.out.println("\nNombre: " + nombre);
        System.out.println("Nivel y salario: " + nivelSalario);
    }

    public static void main(String[] args) {
        mostrarNivelYSalario();
    }
}
