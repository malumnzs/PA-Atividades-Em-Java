package org.JavaMalu;

import java.util.Scanner;
import java.util.Arrays;

public class eadEx7 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] numbers = new int[8];

            System.out.println("Enter 8 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            Arrays.sort(numbers);

            System.out.print("Sorted numbers: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

            sc.close();
        }
    }


