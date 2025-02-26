package org.JavaMalu;

public class eadEx6 {
        public static void main(String[] args) {
            int[] numbers = {10, 15, 22, 37, 40, 55, 60, 75, 80, 95};

            System.out.print("Original list: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }

            int evenCount = 0;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenCount++;
                }
            }

            int[] evenNumbers = new int[evenCount];
            int index = 0;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenNumbers[index++] = num;
                }
            }

            System.out.print("\nList after removing odd numbers: ");
            for (int num : evenNumbers) {
                System.out.print(num + " ");
            }
        }
    }


