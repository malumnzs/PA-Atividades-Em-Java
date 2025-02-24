package org.salatarde.br;

import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        if (number1 + number2 > 100) {
            System.out.println("The sum is greater than 100");
        } else {
            System.out.println("The sum is not greater than 100");
        }
    }
}
