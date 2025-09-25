package Ejercicios_T1;
import java.io.File;

public class Ejercicio1_9 {
    public static void main(String[] args) {
        File directorio = new File(args[0]);
    }

    public void getInformacio(File elem) {
        System.out.println("Nombre: " + elem.getName());
        String tipo = elem.isDirectory() ? "Directorio" : "Fichero";
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicación: " + elem.getAbsolutePath());
        System.out.println("Ultima modificación: " + elem.lastModified());
        String oculto = elem.isHidden() ? "Si" : "No";
        System.out.println("Oculto: " + oculto);
    }

    public void creaCarpeta(String dirName) {
        File newDir = new File("./");
        newDir.renameTo(new File(dirName));
        newDir.mkdir();
    }

    public void creaFitxer() {
        File newFile = new File("./");
    }
}
