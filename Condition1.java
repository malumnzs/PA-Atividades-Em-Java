package org.casa.br;

import java.util.Scanner;

public class Condition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'Yes' ou 'No':");

        String answer = sc.nextLine();

        if (answer.equals("Yes")){
            System.out.println("You answer 'Yes'.");

        } else if (answer.equals ("No")) {
            System.out.println("You answer 'No'.");

        } else {
            System.out.println("Invalid answer! Please, enter 'Yes' ou 'No'.");
        }

        sc.close();
    }
}
