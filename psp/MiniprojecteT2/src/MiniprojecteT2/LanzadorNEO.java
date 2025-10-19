package MiniprojecteT2;

import java.io.*;
import java.util.*;

public class LanzadorNEO {
    public static void main(String[] args) throws IOException, InterruptedException {
        long inicioTotal = System.currentTimeMillis();

        List<NEO> neos = leerNEOs("./src/Ejercicio_NEO/neos.txt");
        System.out.println("Total de NEOs a analizar: " + neos.size());

        String javaHome = System.getProperty("java.home");
        String javaBin = javaHome + File.separator + "bin" + File.separator + "java";
        String classpath = System.getProperty("java.class.path");
        String clase = "Ejercicio_NEO.CalculadoraNEO";

        int bloque = 4;
        int totalProcesados = 0;

        for (int i = 0; i < neos.size(); i += bloque) {
            long inicioBloque = System.currentTimeMillis();
            List<Process> procesos = new ArrayList<>();

            for (int j = i; j < i + bloque && j < neos.size(); j++) {
                NEO n = neos.get(j);

                List<String> comando = new ArrayList<>();
                comando.add(javaBin);
                comando.add("-cp");
                comando.add(classpath);
                comando.add(clase);
                comando.add(n.getNombre());
                comando.add(String.valueOf(n.getPosicio()));
                comando.add(String.valueOf(n.getVelocitat()));

                ProcessBuilder pb = new ProcessBuilder(comando);
                pb.inheritIO();
                procesos.add(pb.start());
            }

            for (Process p : procesos) {
                p.waitFor();
            }

            long finBloque = System.currentTimeMillis();
            totalProcesados += procesos.size();
            System.out.println("→ Bloque completado en " + (finBloque - inicioBloque) + " ms");
        }

        long finTotal = System.currentTimeMillis();
        double tiempoTotal = (finTotal - inicioTotal);
        double tiempoMedio = tiempoTotal / totalProcesados;

        System.out.printf("%n⏱ Tiempo total: %.2f ms%n", tiempoTotal);
        System.out.printf("⏱ Tiempo medio por NEO: %.2f ms%n", tiempoMedio);
    }

    private static List<NEO> leerNEOs(String ruta) throws IOException {
        List<NEO> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    lista.add(new NEO(partes[0],
                            Double.parseDouble(partes[1]),
                            Double.parseDouble(partes[2])));
                }
            }
        }
        return lista;
    }
}
