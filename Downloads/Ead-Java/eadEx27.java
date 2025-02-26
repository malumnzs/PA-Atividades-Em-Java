package org.JavaMalu;

public class eadEx27 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int sum = 0;

            for (int[] row : matrix) {
                for (int num : row) {
                    sum += num;
                }
            }

            System.out.println("Sum of all elements: " + sum);
        }
    }


