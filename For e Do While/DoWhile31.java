package org.JavaMalu;

import java.util.Scanner;

public class DoWhile31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {

            System.out.println("Digite um número: ");
            numero = sc.nextInt();
        }while (numero >= 0);

        System.out.println("Número negativo detectado! Programa encerrado.");

        sc.close();

    }
}