package Ejercicios_T1;

public class Ej34 {
    public static void main(String[] args) {
        long factorial = 1;
        for (int i = 2; i <= 15; i++) factorial *= i;
        System.out.println("15! = " + factorial);
    }
}
