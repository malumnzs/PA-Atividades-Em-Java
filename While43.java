import java.util.Scanner;

public class While43 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um n�mero:");
        int numero = scan.nextInt();
        int soma = 0;

        do {
            soma += numero % 10;
            numero /= 10;

        } while (numero > 0);

        System.out.println("A soma dos digitos �:" + soma);
    }
}
