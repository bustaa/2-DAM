package Ejercicio_T2;

import java.io.*;

public class Sumador2 {
    public static void main(String[] args) throws IOException {
        int n1, n2, res;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        res = 0;

        for (int i = n1; i <= n2; i++) {
            res += i;
        }

        writeResInFile(res);
    }

    public static void writeResInFile(int res) throws IOException {
        File resFichero = new File("./res.txt");
        if (resFichero.createNewFile()) {
            System.out.println("Fichero creado correctamante");
        } else {
            System.out.println("Error al crear el fichero");
        }
        BufferedWriter br = new BufferedWriter(new FileWriter(resFichero));
        br.write(String.valueOf(res));
        br.close();
    }
}
