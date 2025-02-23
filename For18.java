package program.Java;
import java.util.Scanner;
public class For18 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe uma string: ");
            String input = scanner.nextLine();
            if (isPalindromo(input)) {
                System.out.println("A string é um palíndromo.");
            } else {
                System.out.println("A string não é um palíndromo.");
            }
            scanner.close();
        }

        public static boolean isPalindromo(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }


