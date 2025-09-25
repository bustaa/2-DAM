package EjemplosFile;
import java.io.*;

public class Test1 {
    public static void main(String args[]) {

//		File fichero = new File("test.txt");
//
//		System.out.println("Nombre del archivo: " + fichero.getName());
//		System.out.println("Ruta: " + fichero.getPath());
//		System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
//		System.out.println("Se puede leer: " + fichero.canRead());
//		System.out.println("Se puede escribir: " + fichero.canWrite());
//		System.out.println("Tamaño: " + fichero.length());

//		File directorio = new File(".");
//		String[] listaArchivos = directorio.list();
//		System.out.println("Contenido directorio: " + directorio.getName());
//
//		for (String s : listaArchivos) {
//			System.out.println(s);
//		}

//		String strdirectorio2 = args[0];
//		System.out.println(strdirectorio2);
//
//		File directorio2 = new File(strdirectorio2);
//		FiltroExtension filtro = new FiltroExtension(".txt");
//		String[] listaArchivos2 = directorio2.list(filtro);
//		for (int i = 0; i < listaArchivos2.length; i++) {
//			System.out.println(listaArchivos2[i]);
//		}

        File fichero = new File("test.txt");
        try {
            fichero.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
