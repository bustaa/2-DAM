package Ejercicios_T1;

public class Ej35 {
    public static int mayor(int[] numeros) {
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max) max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] valores = {5, 12, 7, 3, 20, 8};
        System.out.println("El mayor valor es: " + mayor(valores));
    }
}
