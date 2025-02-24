import java.util.Scanner;

public class For22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número para exibir os divisores:");

        int num1 = scan.nextInt();
        System.out.println("Os divisores de" + num1 + "são:");

        for (int i = 1; i <= num1; i++){
            if (num1 % i == 0) {

                System.out.println(i);
            }
        }
    }
}
