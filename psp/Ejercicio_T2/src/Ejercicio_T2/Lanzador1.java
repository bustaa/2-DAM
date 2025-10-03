package Ejercicio_T2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lanzador1 {
    public static void main(String[] args) throws IOException {
        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String clase = "Ejercicio_T2.Sumador1";

        int n1, n2;
        n1 = 10;
        n2 = 50;

        List<String> command = new ArrayList<>();
        command.add(javaBin);
        command.add("-cp");
        command.add(classpath);
        command.add(clase);
        command.add(String.valueOf(n1));
        command.add(String.valueOf(n2));

        ProcessBuilder builder = new ProcessBuilder(command);
        builder.inheritIO().start();
    }
}
