import java.util.Scanner;

public class While46 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um n�mero: ");
        int numero = scan.nextInt();
        int contador = 1;

        System.out.println("Os primeiros 10 m�ltiplos de " + numero + " s�o:");

        do {
                    System.out.println(numero * contador);
                    contador++;
        } while (contador <= 10);
            }
        }



