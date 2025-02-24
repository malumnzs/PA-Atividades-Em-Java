package org.JavaMalu;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra;

        System.out.println("Digite uma palavra: ");
        palavra = sc.nextLine();

        if (palavra.length() > 5){
            System.out.println("Essa palavra tem mais de 5 caracteres!");
        }
        else{
            System.out.println("A palavra tem 5 ou menos caracteres!");
        }


    }
}

