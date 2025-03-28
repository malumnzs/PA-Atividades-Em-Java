package org.salatarde.br;

import java.util.Scanner;

public class Math3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        if (number2 != 0 && number1 % number2 == 0) {
            System.out.println(number1 + " is divisible by " + number2);
        } else if (number2 == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println(number1 + " is not divisible by " + number2);
        }
    }
}
