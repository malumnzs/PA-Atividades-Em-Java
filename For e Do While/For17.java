package For;

import java.util.Scanner;

import static java.lang.Long.reverse;

public class For17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();
        String caracteres = "";


        for( int i = palavra.length()-1;  i>=0; i--){
caracteres = caracteres + palavra.charAt(i);
        }

            System.out.println(caracteres);
    }
}

