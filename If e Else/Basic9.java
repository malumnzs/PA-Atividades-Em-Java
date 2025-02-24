package org.salatarde.br;

import java.util.Scanner;

public class Basic9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int numero = sc.nextInt();

        if (numero >= 10 && numero <= 50) {
            System.out.println("Esse número está entre 10 e 50!");
        }
        else {
            System.out.println("Esse número não está entre 10 e 50!");
        }


    }
}
