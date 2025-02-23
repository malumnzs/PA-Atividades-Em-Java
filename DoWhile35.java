package org.JavaMalu;

import java.util.Scanner;

public class DoWhile35 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
        System.out.println("Tabuada finalizada!");
        sc.close();
    }
}
