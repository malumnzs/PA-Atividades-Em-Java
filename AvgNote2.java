package org.casa.br;

import java.util.Scanner;

public class AvgNote2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = sc.nextDouble();

        double average = (grade1 + grade2) / 2;

        if (average >= 7) {
            System.out.println("The student is approved! Average: " + average);
        } else if (average >= 5) {
            System.out.println("The student is in recovery. Average: " + average);
        } else {
            System.out.println("The student is failed. Average: " + average);
        }

        sc.close();
    }
}
