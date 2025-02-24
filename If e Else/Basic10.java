package org.salatarde.br;

import java.util.Scanner;

public class Basic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número : ");
        int numero = sc.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("Esse número está entre 100 e 200!");
        }
        else {
            System.out.println("Esse número não está entre 100 e 200!");
        }


    }
}

