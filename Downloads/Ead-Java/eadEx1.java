package org.JavaMalu;

import java.util.Scanner;

public class eadEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("Entered numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        sc.close();


    }
}
