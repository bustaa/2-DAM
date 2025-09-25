package Ejercicios_T1;
import java.io.File;

public class Ejercicio1_3 {
    public static void main(String args[]) {
        File directorio = new File(args[0]);

        if (directorio.exists()) {
            System.out.println("Nombre: " + directorio.getName());
            System.out.println("Ruta relativa: " + directorio.getPath());
            System.out.println("Ruta absoluta: " + directorio.getAbsolutePath());
            System.out.println("Permiso escritura: " + directorio.canWrite());
            System.out.println("Permiso lectura: " + directorio.canRead());
            System.out.println("Tamaño: " + directorio.length());

            System.out.println("Contenido: ");
            String[] listaContenido = directorio.list();

            for (String e : listaContenido) {
                System.out.println(e);
            }
        }
    }
}
