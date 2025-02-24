package org.casa.br;

import java.util.Scanner;

public class FinancialDecisions1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your amount: ");
        double balance = sc.nextDouble();

        if (balance <= 0) {
            System.out.println("You don't have enough money");
        }
        else {
            System.out.println("You can make a withdrawal");
        }
    }
}