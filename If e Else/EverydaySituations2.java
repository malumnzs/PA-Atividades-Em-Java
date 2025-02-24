package org.casa.br;

import java.util.Scanner;

public class EverydaySituations2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctCode = 1234;  // Example access code
        System.out.print("Enter the access code: ");
        int enteredCode = sc.nextInt();

        if (enteredCode == correctCode) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
