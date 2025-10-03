package Ejercicios_T1;

import java.util.Random;

public class Ej24 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(10) + 1;
        int numeroUsuario = Integer.parseInt(args[0]);

        System.out.println("Tu número: " + numeroUsuario);
        System.out.println("Número aleatorio: " + numeroAleatorio);

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("Has ganado.");
        } else {
            System.out.println("Has perdido.");
        }
    }
}
