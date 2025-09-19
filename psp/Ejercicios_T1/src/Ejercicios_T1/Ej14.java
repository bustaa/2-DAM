package Ejercicios_T1;
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio, diametro, area;

        System.out.print("Inserte el radio: ");
        radio = sc.nextDouble();
        diametro = radio * 2;
        area =  Math.PI * Math.pow(radio, 2);

        System.out.println("Diametro: " + diametro);
        System.out.println("Area: " + area);
    }
}
