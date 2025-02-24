package org.salatarde.br;

import java.util.Scanner;

public class Basic3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter a second number: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("The largest number is: " + number1);
        } else if (number2 > number1) {
            System.out.println("The largest number is: " + number2);
        } else {
            System.out.println("The numbers are the same.");
        }
    }
}

