package Ejercicios_T1;

import java.util.Scanner;

public class Ej27 {

    public static String calcularLetraDNI(int nDNI) {
        String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int nLetraDNI = nDNI % 23;
        return letrasDNI[nLetraDNI];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de DNI (sin letra): ");
        int nDNI = sc.nextInt();

        String letra = calcularLetraDNI(nDNI);

        String totalDNI = nDNI + letra;
        System.out.println("DNI completo: " + totalDNI);
    }
}
