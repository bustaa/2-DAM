package Ejercicios_T1;

import java.util.Scanner;

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

public class Ej28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo[] vehiculos = new Vehiculo[5];

        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("Introduce los datos del vehículo " + (i + 1) + ":");
            System.out.print("Tipo (coche, motocicleta, etc.): ");
            String tipo = sc.nextLine();
            System.out.print("Marca: ");
            String marca = sc.nextLine();
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            vehiculos[i] = new Vehiculo(tipo, marca, modelo);
            System.out.println();
        }

        System.out.println("Vehículos creados:");
        for (Vehiculo v : vehiculos) {
            v.mostrar();
        }
    }
}
