package Ejercicios_T1;
import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int nDNI, nLetraDNI;
        String totalDNI;

        System.out.print("Ingrese el numero de DNI (sin letra): ");
        nDNI = sc.nextInt();
        nLetraDNI = nDNI % 23;
        totalDNI = Integer.toString(nDNI) + letrasDNI[nLetraDNI];

        System.out.println("DNI: " + totalDNI);
    }
}
