package org.casa.br;

import java.util.Scanner;

public class ChallengesGames2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        if (num1 > 2 * num2) {
            System.out.println(num1 + " is greater than twice " + num2);
        } else if (num2 > 2 * num1) {
            System.out.println(num2 + " is greater than twice " + num1);
        } else {
            System.out.println("Neither number is greater than twice the other.");
        }
    }
}
