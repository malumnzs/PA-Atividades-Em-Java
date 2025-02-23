package program.Java;
import java.util.Scanner;
public class For19 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe um número: ");
            int num = scanner.nextInt();
            long fatorial = 1;
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + num + " é " + fatorial + ".");
            scanner.close();
        }
    }


