package org.casa.br;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Password:");
        String Password = sc.nextLine();

        if (Password.equals("1234")) {
            System.out.println("Correct Password!");
        } else {
            System.out.println("Incorrect Password!");
        }
    }
}
