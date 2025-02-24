package org.JavaMalu;

import java.util.Scanner;

public class Math5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int num;

        System.out.println("Digite um número: ");
        num = sc.nextInt();

        int raiz = (int) Math.sqrt(num);

        // Verifica se o quadrado da raiz encontrada é igual ao número original
        if (raiz * raiz == num) {
            System.out.println(num + " é um quadrado perfeito.");
        } else {
            System.out.println(num + " não é um quadrado perfeito.");
        }
    }
}
