package org.JavaMalu;

import java.util.Random;

public class eadEx4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
        System.out.println("Generated numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);

    }
}
