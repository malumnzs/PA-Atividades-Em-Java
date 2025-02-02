package org.JavaMalu;

import java.util.Scanner;

public class ChallengesGames4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextInt();

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        System.out.println("Números em ordem crescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);



        }
    }

