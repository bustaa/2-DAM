package Ejercicios_T1;

import java.util.Random;

public class Ej25 {
    public static void main(String[] args) {
        int[] numerosUsuario = new int[3];
        for (int i = 0; i < 3; i++) {
            numerosUsuario[i] = Integer.parseInt(args[i]);
        }

        Random rand = new Random();
        int[] numerosAleatorios = new int[3];
        for (int i = 0; i < 3; i++) {
            numerosAleatorios[i] = rand.nextInt(10) + 1;
        }

        System.out.println("Tus números:       " + numerosUsuario[0] + ", " + numerosUsuario[1] + ", " + numerosUsuario[2]);
        System.out.println("Números aleatorios: " + numerosAleatorios[0] + ", " + numerosAleatorios[1] + ", " + numerosAleatorios[2]);

        int aciertos = 0;
        for (int i = 0; i < 3; i++) {
            if (numerosUsuario[i] == numerosAleatorios[i]) {
                aciertos++;
            }
        }

        if (aciertos == 0) {
            System.out.println("No has acertado ningun numero.");
        } else {
            System.out.println("Has acertado " + aciertos + " numero(s)");
        }
    }
}
