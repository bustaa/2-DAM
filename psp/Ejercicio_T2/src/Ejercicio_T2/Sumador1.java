package Ejercicio_T2;

public class Sumador1 {
    public static void main(String[] args) {
        int n1, n2, res;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        res = 0;

        for (int i = n1; i <= n2; i++) {
            res += i;
        }

        System.out.println("Suma total: " + res);
    }
}
