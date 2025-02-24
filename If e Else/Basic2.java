package org.salatarde.br;

import java.util.Scanner;

public class Basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("This number is pair");

        } else {
            System.out.println("This number is odd");
        }
    }
}

