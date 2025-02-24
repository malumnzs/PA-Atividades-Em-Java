package org.program;

import java.util.Scanner;

public class ChallengeGames4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("DIgite o terceiro número: ");
        num3 = sc.nextInt();

        if (num1 > num2) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
        }

        if (num1 > num3) {
            num1 = num1 + num3;
            num3 = num1 - num3;
            num1 = num1 - num3;
        }

        if (num2 > num3) {
            num2 = num2 + num3;
            num3 = num2 - num3;
            num2 = num2 - num3;
        }

        // Exibindo os números em ordem crescente
        System.out.println("Os números em ordem crescente são: " + num1 + ", " + num2 + ", " + num3);

    }
}
