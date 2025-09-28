package Ejercicios_T1;

import java.util.Scanner;
import java.util.ArrayList;

public class Ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> personas = new ArrayList<String>();
        String nombrePersona = "";

        do {
            System.out.print("Introduce el nombre de la persona (0 para salir): ");
            nombrePersona = sc.nextLine();
            if (!nombrePersona.equals("0")) personas.add(nombrePersona);
        } while (!nombrePersona.equals("0"));

        for (int i = 0; i < personas.size(); i++) {
            System.out.println((i + 1) + ". " + personas.get(i));
        }
    }
}
