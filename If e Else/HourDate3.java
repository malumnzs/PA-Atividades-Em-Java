package org.casa.br;
import java.util.Scanner;
public class HourDate3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();

        boolean isValid = false;
        if (month == 2) {
            if (day >= 1 && day <= 28) isValid = true;  // Non-leap year
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 30) isValid = true;
        } else if (month >= 1 && month <= 12) {
            if (day >= 1 && day <= 31) isValid = true;
        }

        if (isValid) {
            System.out.println("Valid day for month " + month);
        } else {
            System.out.println("Invalid day for month " + month);
        }
    }
}
