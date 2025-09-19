package Ejercicios_T1;
import java.util.Scanner;
import java.util.ArrayList;

public class Ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> suspensos = new ArrayList<Integer>();
        ArrayList<Integer> aprobados = new ArrayList<Integer>();
        ArrayList<Integer> notables = new ArrayList<Integer>();
        ArrayList<Integer> excelentes = new ArrayList<Integer>();
        ArrayList<Integer> matricula = new ArrayList<Integer>();

        int[] notas = new int[10];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce una nota: ");
            notas[i] = sc.nextInt();
        }

        for (int nota : notas) {
            if (nota < 5) suspensos.add(nota);
            else if (nota >= 5 && nota < 6) aprobados.add(nota);
            else if (nota >= 6 && nota < 8) notables.add(nota);
            else if (nota >= 8 && nota < 9) excelentes.add(nota);
            else if (nota >= 9) matricula.add(nota);
        }

        System.out.println("Suspensos: " + suspensos.size());
        System.out.println("Aprobados: " + aprobados.size());
        System.out.println("Notables: " + notables.size());
        System.out.println("Excelentes: " + excelentes.size());
        System.out.println("Matriculas: " + matricula.size());
    }
}
