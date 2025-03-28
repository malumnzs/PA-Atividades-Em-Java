package org.JavaMalu;

public class eadEx30 {
        public static void main(String[] args) {
            int[] numbers = {4, -2, 7, -5, 10, -8, 3};

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < 0) {
                    numbers[i] = 0;
                }
            }


            System.out.print("Updated list: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }
    }


