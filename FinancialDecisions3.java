package org.casa.br;

import java.util.Scanner;

public class FinancialDecisions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        if (salary >= 3000) {
            System.out.println("You can finance a property!");
        }
        else {
            System.out.println("You can not finance property!");
        }
    }
}
