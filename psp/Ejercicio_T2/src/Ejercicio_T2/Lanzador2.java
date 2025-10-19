package Ejercicio_T2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lanzador2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String clase = "Ejercicio_T2.Sumador2";

        int n1 = 10;
        int n2 = 50;

        List<String> command = new ArrayList<>();
        command.add(javaBin);
        command.add("-cp");
        command.add(classpath);
        command.add(clase);
        command.add(String.valueOf(n1));
        command.add(String.valueOf(n2));

        ProcessBuilder builder = new ProcessBuilder(command);
        builder.inheritIO();
        Process proceso = builder.start();

        int exitCode = proceso.waitFor();
        System.out.println("Proceso finalizado con código: " + exitCode);

        File resFichero = new File("./res.txt");

        int intentos = 0;
        while ((!resFichero.exists() || resFichero.length() == 0) && intentos < 10) {
            Thread.sleep(500);
            intentos++;
        }

        if (!resFichero.exists()) {
            System.out.println("Error: el fichero de resultado no se ha creado.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(resFichero))) {
            String linea = br.readLine();
            if (linea != null) {
                System.out.println("El resultado leído del fichero es: " + linea);
            } else {
                System.out.println("El fichero está vacío.");
            }
        }
    }
}
