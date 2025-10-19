package Ejercicio_T2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lanzador3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String clase = "Ejercicio_T2.Sumador2";

        ejecutarSumador(javaBin, classpath, clase, 1, 10, "res1.txt");

        ejecutarSumador(javaBin, classpath, clase, 20, 50, "res2.txt");

        mostrarResultado("res1.txt");
        mostrarResultado("res2.txt");
    }

    private static void ejecutarSumador(String javaBin, String classpath, String clase, int n1, int n2, String nombreFinal) throws IOException, InterruptedException {
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
        proceso.waitFor();

        File resTemp = new File("./res.txt");
        File resFinal = new File("./" + nombreFinal);

        int intentos = 0;
        while ((!resTemp.exists() || resTemp.length() == 0) && intentos < 10) {
            Thread.sleep(500);
            intentos++;
        }

        if (resTemp.exists()) {
            if (resFinal.exists()) resFinal.delete();
            resTemp.renameTo(resFinal);
        } else {
            System.out.println("Error: no se generó el fichero res.txt en la ejecución.");
        }
    }

    private static void mostrarResultado(String nombreFichero) {
        File file = new File("./" + nombreFichero);
        if (!file.exists()) {
            System.out.println("El fichero " + nombreFichero + " no existe.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linea = br.readLine();
            System.out.println("Resultado leído de " + nombreFichero + ": " + linea);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero " + nombreFichero);
        }
    }
}
