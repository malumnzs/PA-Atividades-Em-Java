package org.casa.br;

import java.util.Scanner;

public class CategoriesAndClassifications1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age < 12) {
            System.out.println("You are a Kid!");
        }
        else if (age <= 17) {
            System.out.println("You are a Teenager!");
        }
        else if (age <= 59) {
            System.out.println("You are a adult!");
        }
        else {
            System.out.println("You are a elderly!");
        }
    }
}
