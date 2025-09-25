package Ejercicios_T1;
import java.io.File;

public class Ejercicio1_1 {
    public static void main(String args[]) {
        File directorio = new File(args[0]);
        System.out.println(directorio.getName());
    }
}
