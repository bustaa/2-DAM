package MiniprojecteT2;

import java.io.*;

public class CalculadoraNEO {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.err.println("Uso: CalculadoraNEO <nombre> <posicioNEO> <velocitatNEO>");
            System.exit(1);
        }

        String nombre = args[0];
        double posicioNEO = Double.parseDouble(args[1]);
        double velocitatNEO = Double.parseDouble(args[2]);

        double posicioTerra = 1;
        double velocitatTerra = 100;

        for (int i = 0; i < (50 * 365 * 24); i++) {
            posicioNEO = posicioNEO + velocitatNEO * i;
            posicioTerra = posicioTerra + velocitatTerra * i;
        }

        double resultat = 100 * Math.random() *
                Math.pow(((posicioNEO - posicioTerra) / (posicioNEO + posicioTerra)), 2);

        File file = new File("./" + nombre + ".txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write(String.format("%.2f", resultat));
        } catch (IOException e) {
            System.err.println("Error escribiendo el fichero de " + nombre);
        }

        System.out.printf("Probabilidad de colisión de %s: %.2f%%%n", nombre, resultat);
        if (resultat > 10.0) {
            System.err.println("⚠ ALERTA MUNDIAL: " + nombre + " supera el 10% de probabilidad!");
        } else {
            System.out.println("🌍 Tranquilidad: " + nombre + " no supone un riesgo grave.");
        }
    }
}
