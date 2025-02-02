package org.casa.br;

import java.util.Scanner;

public class Condition3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();

        if (!name.isEmpty() && name.charAt(0) == 'A') {
            System.out.println("The name starts with the letter 'A'.");
        } else {
            System.out.println("The name does not starts with the letter a'A'.");
        }

        sc.close();
    }
}
