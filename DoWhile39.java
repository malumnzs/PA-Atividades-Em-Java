package org.JavaMalu;

import java.util.Scanner;

public class DoWhile39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Digite um número: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println("Número positivo: " + numero);
            }
        }while(numero > 0);

        System.out.println("Número negativo digitado, programa encerrado!");
        sc.close();

    }
}
