package org.JavaMalu;

import java.util.Scanner;

public class DoWhile32 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Digite um numero: ");
            num1 = sc.nextInt();

            System.out.println("Digite outro numero: ");
            num2 = sc.nextInt();
            if (num1 != 0 && num2 != 0){
                int soma = num1 + num2;
                System.out.println("Soma: " + soma);
            }

        } while (num1 != 0 && num2 != 0);

        System.out.println("Número zero detectado. Programa encerrado.");
        sc.close();


    }
}

