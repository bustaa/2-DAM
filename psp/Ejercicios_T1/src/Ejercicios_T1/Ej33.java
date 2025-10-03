package Ejercicios_T1;

public class Ej33 {
    public static int sumarPares(int n) {
        int suma = 0;
        for (int i = 2; i <= n; i += 2) {
            suma += i;
        }
        return suma;
    }

    public static void main(String[] args) {
        int numero = 10;
        int resultado = sumarPares(numero);
        System.out.println("La suma de los números pares hasta " + numero + " es: " + resultado);
    }
}
