package org.JavaMalu;

import java.util.Random;

public class eadEx18 {

        public static void main(String[] args) {
            Random random = new Random();
            int[][] matrix = new int[4][4];
            int sum = 0;
            int totalElements = 4 * 4;

            System.out.println("Generated 4x4 matrix:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = random.nextInt(100) + 1;
                    sum += matrix[i][j];
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            double average = (double) sum / totalElements;

            System.out.println("\nAverage of all elements: " + average);
        }
    }


