package org.casa.br;

import java.util.Scanner;

public class AvgNote3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = sc.nextDouble();

        System.out.print("Enter the third grade: ");
        double grade3 = sc.nextDouble();

        double highest = Math.max(grade1, Math.max(grade2, grade3));
        double lowest = Math.min(grade1, Math.min(grade2, grade3));

        System.out.println("The highest grade is: " + highest);
        System.out.println("The lowest grade is: " + lowest);

        sc.close();
    }
}
