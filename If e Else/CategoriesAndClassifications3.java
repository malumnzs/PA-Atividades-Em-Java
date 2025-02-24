package org.casa.br;

import java.util.Scanner;

public class CategoriesAndClassifications3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in 'cm': ");
        int height = sc.nextInt();

        if (height <= 160) {
            System.out.println("You are a small!");
        }
        else if (height <= 180) {
            System.out.println("You are a average!");
        }
        else {
            System.out.println("You are a tall");
        }
    }
}
