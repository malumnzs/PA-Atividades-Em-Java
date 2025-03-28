package org.casa.br;

import java.util.Scanner;

public class CategoriesAndClassifications2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter a Number: ");
            int Number = sc.nextInt();

            if (Number <= 10) {
                System.out.println("You are a A!");
            }
            else if (Number <= 20) {
                System.out.println("You are a B!");
            }
            else {
                System.out.println("You are a C!");
            }
        }
}
