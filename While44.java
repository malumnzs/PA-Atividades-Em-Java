import java.util.Scanner;

public class While44 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um n�mero:");
        int numero = scan.nextInt();
        int divisor = 1;

        System.out.println("Os divisores de" + numero + "s�o");

        do{
            if  (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;


        } while (divisor <= numero);
    }
}
