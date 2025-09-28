package Ejercicios_T1;

import java.util.Scanner;
import java.util.ArrayList;

class Vehiculo {
    String tipo;
    String marca;
    String modelo;

    public Vehiculo(String tipo, String marca, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrar() {
        System.out.println("Tipus: " + tipo + ", Marca: " + marca + ", Model: " + modelo);
    }
}

public class Ej29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        while (true) {
            System.out.println("Introduce los datos del vehículo (o escribe '0' como tipo para terminar):");
            System.out.print("Tipo (coche, motocicleta, etc.): ");
            String tipo = sc.nextLine();
            if (tipo.equals("0")) break;

            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            vehiculos.add(new Vehiculo(tipo, marca, modelo));
            System.out.println();
        }

        System.out.println("Vehículos creados:");
        for (Vehiculo v : vehiculos) {
            v.mostrar();
        }
    }
}
