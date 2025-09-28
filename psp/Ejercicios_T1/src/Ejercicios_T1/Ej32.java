package Ejercicios_T1;

import java.util.ArrayList;

public class Ej32 {
    public static void main(String[] args) {
        String[] companyeros = {"Ana", "Luis", "Marta", "Carlos", "Sofia", "Javier"};

        for (String nombre : companyeros) {
            System.out.println(nombre);
        }

        ArrayList<String> companyerosArrList = new ArrayList<>();
        companyerosArrList.add("Ana");
        companyerosArrList.add("Luis");
        companyerosArrList.add("Marta");
        companyerosArrList.add("Carlos");
        companyerosArrList.add("Sofia");
        companyerosArrList.add("Javier");

        for (String nombre: companyerosArrList) {
            System.out.println(nombre);
        }
    }
}
