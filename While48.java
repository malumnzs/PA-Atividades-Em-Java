package DoWhile;

import java.util.Scanner;

public class Ativ_48 {
    public static void parOuImpar() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um número (0 para sair): ");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println("Encerrando...");
                break;
            }
            System.out.println(num + " é " + (num % 2 == 0 ? "par" : "ímpar"));
        } while (num != 0);
    }
    }