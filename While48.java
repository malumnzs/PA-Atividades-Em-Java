package DoWhile;

import java.util.Scanner;

public class Ativ_48 {
    public static void parOuImpar() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Digite um n�mero (0 para sair): ");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println("Encerrando...");
                break;
            }
            System.out.println(num + " � " + (num % 2 == 0 ? "par" : "�mpar"));
        } while (num != 0);
    }
    }