import java.util.Scanner;

public class For21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");

        String num1 = scan.nextLine();
        int soma = 0;


        for (int i = 0; i < num1.length(); i++){
            char digitoschar = num1.charAt(i);

            if(Character.isDigit(digitoschar)){
                int digito = Character.getNumericValue(digitoschar);
                soma += digito;
            }

        }
        System.out.println("A soma dos digitos é:" + soma);
    }
}
