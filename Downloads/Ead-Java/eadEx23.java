package org.JavaMalu;

import java.util.Scanner;

public class eadEx23 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = {2, 4, 6, 8, 10};

            System.out.print("Enter a number to multiply the list elements: ");
            int multiplier = sc.nextInt();

            System.out.println("\nList after multiplication:");
            for (int num : numbers) {
                System.out.println(num * multiplier);
            }

            sc.close();
        }
    }


