package Ejercicio_T2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lanzador5 {
    public static void main(String[] args) throws IOException, InterruptedException {
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String clase = "Ejercicio_T2.Sumador1";

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
        Process proceso = builder.start();

        File salida = new File("./salida_sumador1.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
             BufferedWriter bw = new BufferedWriter(new FileWriter(salida))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }
        }

        try (BufferedReader brErr = new BufferedReader(new InputStreamReader(proceso.getErrorStream()))) {
            String lineaErr;
            while ((lineaErr = brErr.readLine()) != null) {
                System.err.println("Error del proceso: " + lineaErr);
            }
        }

        int exitCode = proceso.waitFor();
        System.out.println("Proceso terminado con código: " + exitCode);
        System.out.println("La salida del proceso se ha guardado en: " + salida.getAbsolutePath());
    }
}
