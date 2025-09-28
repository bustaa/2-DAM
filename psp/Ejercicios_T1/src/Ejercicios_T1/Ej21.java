package Ejercicios_T1;

import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] personas = new String[5];

        for (int i = 0; i < personas.length; i++) {
            System.out.print("(" + (i+1) + ") Introduce el nombre de la persona: " );
            personas[i] = sc.nextLine();
        }
    }
}
