package Ejercicios_T1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej26 {
    public static String clasificarNota(int nota) {
        if (nota < 5) return "Suspenso";
        else if (nota >= 5 && nota < 6) return "Aprobado";
        else if (nota >= 6 && nota < 8) return "Notable";
        else if (nota >= 8 && nota < 9) return "Excelente";
        else return "Matricula";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> suspensos = new ArrayList<>();
        ArrayList<Integer> aprobados = new ArrayList<>();
        ArrayList<Integer> notables = new ArrayList<>();
        ArrayList<Integer> excelentes = new ArrayList<>();
        ArrayList<Integer> matricula = new ArrayList<>();

        int[] notas = new int[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce una nota: ");
            notas[i] = sc.nextInt();
        }

        for (int nota : notas) {
            String categoria = clasificarNota(nota);
            switch (categoria) {
                case "Suspenso" -> suspensos.add(nota);
                case "Aprobado" -> aprobados.add(nota);
                case "Notable" -> notables.add(nota);
                case "Excelente" -> excelentes.add(nota);
                case "Matricula" -> matricula.add(nota);
            }
        }

        System.out.println("Suspensos: " + suspensos.size());
        System.out.println("Aprobados: " + aprobados.size());
        System.out.println("Notables: " + notables.size());
        System.out.println("Excelentes: " + excelentes.size());
        System.out.println("Matriculas: " + matricula.size());
    }
}
