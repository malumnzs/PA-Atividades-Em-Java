import java.util.Scanner;

public class While45 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor maximo para a sequencia Fibonacci");
        int maximo = scan.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci até:" + maximo + ":");
while (a <= maximo) {
    System.out.println(a +"");
    int temp = a;
    a = b;
    b = temp +b;
}

    }
}
