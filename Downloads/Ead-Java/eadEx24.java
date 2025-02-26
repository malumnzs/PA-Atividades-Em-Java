package org.JavaMalu;

public class eadEx24 {
        public static void main(String[] args) {
            int[] numbers = {3, 8, 15, 22, 9, 10, 31, 42, 50, 7};

            System.out.println("Even numbers in the list:");
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.println(num);
                }
            }
        }
    }


