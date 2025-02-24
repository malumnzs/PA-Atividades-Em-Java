package org.casa.br;
import java.util.Scanner;
public class EverydaySituations1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last digit of the vehicle's license plate: ");
        int lastDigit = sc.nextInt();

        if (lastDigit % 2 == 0) {
            System.out.println("The vehicle can pass the toll (even number).");
        } else {
            System.out.println("The vehicle cannot pass the toll (odd number).");
        }
    }
}
