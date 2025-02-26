package org.JavaMalu;

import java.util.Scanner;

public class eadEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        int i;
        int sum = 0;

        System.out.println("Enter 5 numbers: ");
        for (i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        System.out.println("The sum of the numbers entered  is: " + sum);
        sc.close();

    }
}
