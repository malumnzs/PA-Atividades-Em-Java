package org.JavaMalu;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra1;
        String palavra2;

        System.out.println("Digite a primeira palavra: ");
        palavra1 = sc.nextLine();

        System.out.println("Digite a segunda palavra: ");
        palavra2 = sc.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais ( ignorando maiúsculas e minúsculas )! ");
        } else {
            System.out.println("As palavras são diferentes!");
        }
    }
}
