package org.salatarde.br;

import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        if (number1 - number2 < 0) {
            System.out.println("The difference is negative");
        } else {
            System.out.println("The difference is positive or null");
        }
    }
}