package DoWhile;

public class Ativ_55 {
    public static void trianguloNumeros() {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.print(j + " ");
                j++;
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= 5);
    }}