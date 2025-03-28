package org.casa.br;
import java.util.Scanner;
public class EverydaySituations3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Choose the conversion: ");
        System.out.println("1. Fahrenheit");
        System.out.println("2. Kelvin");
        int choice = sc.nextInt();

        if (choice == 1) {
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
        } else if (choice == 2) {
            double kelvin = celsius + 273.15;
            System.out.println(celsius + " Celsius is equal to " + kelvin + " Kelvin.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
