package DoWhile;

import java.util.Scanner;

public class Ativ_54 {
    public static void raizQuadrada() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um n�mero: ");
            num = scanner.nextInt();
            if (num >= 0)
                System.out.println("Raiz quadrada: " + Math.sqrt(num));
        } while (num >= 0);
        System.out.println("N�mero negativo digitado. Encerrando...");
    }
}