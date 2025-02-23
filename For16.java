package For;

import java.util.Scanner;

import static java.awt.SystemColor.text;

public class For16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        String palavra = scan.nextLine();
        String caracteres;

        for ( int i = 0; i < palavra.length(); i++ )

            System.out.println(" " + palavra.charAt(i));

    }

}
