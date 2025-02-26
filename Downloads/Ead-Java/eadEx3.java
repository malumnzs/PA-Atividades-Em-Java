package org.JavaMalu;

import java.util.Scanner;

public class eadEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        double sum = 0;

        System.out.println("Enter 6 numbers: ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
        double average = sum/6;

        System.out.println("Average of the numbers entered is " + average);
        sc.close();
    }

}

