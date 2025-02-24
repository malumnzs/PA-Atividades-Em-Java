package org.casa.br;

import java.util.Scanner;

public class ChallengesGames1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else if (num1 < 0 && num2 < 0) {
            System.out.println("Both numbers are negative.");
        } else {
            System.out.println("One number is positive and the other is negative.");
        }
    }
}
