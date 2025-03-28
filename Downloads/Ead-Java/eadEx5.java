package org.JavaMalu;

import java.util.Scanner;

public class eadEx5 {
    public static void main(String[] args) {

                int[] numbers = {5, 12, 23, 34, 45, 56, 67, 78, 89, 90};
                Scanner scanner = new Scanner(System.in);

                System.out.print("List of numbers: ");
                for (int num : numbers) {
                    System.out.print(num + " ");
                }

                System.out.print("\nEnter a number to search in the list: ");
                int userNumber = scanner.nextInt();

                boolean found = false;
                for (int num : numbers) {
                    if (num == userNumber) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("The number " + userNumber + " is in the list!");
                } else {
                    System.out.println("The number " + userNumber + " is NOT in the list.");
                }

                scanner.close();
            }
        }


