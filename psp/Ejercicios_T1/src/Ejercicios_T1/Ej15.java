package Ejercicios_T1;
import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, vol;

        System.out.print("Ingrese el radio: ");
        radio = sc.nextDouble();
        vol = ((double) 4 /3) * Math.PI * Math.pow(radio, 3);

        System.out.println("Volumen de la esfera: " + vol);
    }
}
