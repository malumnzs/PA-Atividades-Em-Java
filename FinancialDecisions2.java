package org.casa.br;

import java.util.Scanner;

public class FinancialDecisions2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the total value of your purchase? ");
        double Total = sc.nextDouble();
        double Discount = 0;

        if (Total <= 500) {
            Discount = Total * 0.10;
        }

        // Calculate final price
        double finalPrice = Total - Discount;

        // Display results
        System.out.println("Original total: $ " + Total);
        System.out.println("Discount: $ " + Discount);
        System.out.println("Final price after discount: $ " + finalPrice);

        sc.close();
    }
}


