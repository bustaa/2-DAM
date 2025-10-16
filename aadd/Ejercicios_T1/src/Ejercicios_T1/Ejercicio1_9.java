package Ejercicios_T1;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio1_9 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introdueix el camí del directori de treball: ");
        String path = sc.nextLine();

        File directori = new File(path);

        if (!directori.exists() || !directori.isDirectory()) {
            System.out.println("Error: El directori no existeix o no és vàlid.");
            return;
        }

        int opcio;
        do {
            System.out.println("\n--- MENÚ GESTOR D'ARXIUS ---");
            System.out.println("1. Mostrar informació");
            System.out.println("2. Crear carpeta");
            System.out.println("3. Crear fitxer");
            System.out.println("4. Eliminar fitxer/carpeta");
            System.out.println("5. Renomenar fitxer/carpeta");
            System.out.println("0. Eixir");
            System.out.print("Tria una opció: ");

            opcio = Integer.parseInt(sc.nextLine());

            switch (opcio) {
                case 1 -> getInformacio(directori);
                case 2 -> creaCarpeta(directori);
                case 3 -> creaFitxer(directori);
                case 4 -> elimina(directori);
                case 5 -> renomena(directori);
                case 0 -> System.out.println("Programa finalitzat.");
                default -> System.out.println("Opció no vàlida.");
            }
        } while (opcio != 0);
    }

    public static void getInformacio(File f) {
        File[] elements = f.listFiles();
        if (elements == null) {
            System.out.println("No s'ha pogut accedir al contingut.");
            return;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File elem : elements) {
            String tipus = elem.isDirectory() ? "Directori" : "Fitxer";
            String ultimaModif = sdf.format(new Date(elem.lastModified()));
            String ocult = elem.isHidden() ? "Si" : "No";

            System.out.println("\nNom: " + elem.getName());
            System.out.println("Tipus: " + tipus);
            System.out.println("Ruta: " + elem.getAbsolutePath());
            System.out.println("Última modificación: " + ultimaModif);
            System.out.println("Ocult: " + ocult);

            if (elem.isFile()) {
                System.out.println("Grandària: " + elem.length() + " bytes");
            } else if (elem.isDirectory()) {
                System.out.println("Elements: " + (elem.list() != null ? elem.list().length : 0));
                System.out.println("Espai lliure: " + elem.getFreeSpace());
                System.out.println("Espai disponible: " + elem.getUsableSpace());
                System.out.println("Espai total: " + elem.getTotalSpace());
            }
        }
    }

    public static void creaCarpeta(File directori) {
        System.out.print("Nom de la nova carpeta: ");
        String nom = sc.nextLine();
        File nova = new File(directori, nom);

        if (nova.exists()) {
            System.out.println("Ja existeix una carpeta/fitxer amb aquest nom.");
        } else if (nova.mkdir()) {
            System.out.println("Carpeta creada correctament.");
        } else {
            System.out.println("Error al crear la carpeta.");
        }
    }

    public static void creaFitxer(File directori) {
        System.out.print("Nom del nou fitxer: ");
        String nom = sc.nextLine();
        File nouFitxer = new File(directori, nom);

        if (nouFitxer.exists()) {
            System.out.println("Ja existeix un fitxer amb aquest nom.");
            return;
        }

        try {
            if (nouFitxer.createNewFile()) {
                System.out.println("Fitxer creat correctament.");
            } else {
                System.out.println("Error al crear el fitxer.");
            }
        } catch (IOException e) {
            System.out.println("Error d'E/S: " + e.getMessage());
        }
    }

    public static void elimina(File directori) {
        System.out.print("Nom del fitxer/carpeta a eliminar: ");
        String nom = sc.nextLine();
        File objecte = new File(directori, nom);

        if (!objecte.exists()) {
            System.out.println("No existeix.");
            return;
        }

        if (objecte.isDirectory()) {
            File[] contingut = objecte.listFiles();
            if (contingut != null && contingut.length > 0) {
                System.out.println("No es pot eliminar un directori que no està buit.");
                return;
            }
        }

        if (objecte.delete()) {
            System.out.println("Eliminat correctament.");
        } else {
            System.out.println("Error al eliminar.");
        }
    }

    public static void renomena(File directori) {
        System.out.print("Nom actual del fitxer/carpeta: ");
        String antic = sc.nextLine();
        File origen = new File(directori, antic);

        if (!origen.exists()) {
            System.out.println("No existeix.");
            return;
        }

        System.out.print("Nou nom: ");
        String nouNom = sc.nextLine();
        File desti = new File(directori, nouNom);

        if (origen.renameTo(desti)) {
            System.out.println("Renomenat correctament.");
        } else {
            System.out.println("Error al renomenar.");
        }
    }
}
