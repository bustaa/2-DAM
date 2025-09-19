package Ejercicios_T1;
import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password, passRep;
        boolean tieneNum, tieneMay, coincide;
        tieneNum = false;
        tieneMay = false;

        do {
            coincide = true;
            System.out.print("Introduzca su contraseña: ");
            password = sc.nextLine();

            System.out.print("Vuelva a introducir su contraseña: ");
            passRep = sc.nextLine();

            if (!password.equals(passRep)) {
                System.out.println("Las contraseñas no coinciden. Vuelva a intentarlo.");
                coincide = false;
            }
        } while (!coincide);

        if (password.length() >= 5) {
            for (int i = 0; i < password.length(); i++) {
                if (isNumeric("" + password.charAt(i))) {
                    tieneNum = true;
                }
                if (isUppercase(password.charAt(i))) {
                    tieneMay = true;
                }
            }
        }

        if (tieneNum && tieneMay) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean isUppercase(char c) {
        char cUpper = Character.toUpperCase(c);
        return cUpper == c;
    }
}
