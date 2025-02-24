package org.salatarde.br;

import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 16) {
            System.out.println("You can vote.");
        } else {
            System.out.println("You can not vote.");
        }
    }
}
