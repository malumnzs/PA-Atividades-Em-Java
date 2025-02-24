package org.casa.br;
import java.util.Scanner;
public class HourDate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            System.out.println("Valid month.");
        } else {
            System.out.println("Invalid month.");
        }
    }
}
