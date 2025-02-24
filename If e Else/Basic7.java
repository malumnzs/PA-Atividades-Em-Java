package org.salatarde.br;

import java.util.Scanner;

public class Basic7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = sc.nextInt();

        if (number % 5 == 0) {
            System.out.println("This Number is a multiple of 5!");
        } else {
            System.out.println("This number is not a multiple of 5!");
        }
    }
}

