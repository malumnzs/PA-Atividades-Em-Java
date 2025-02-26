package org.JavaMalu;

public class eadEx29 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int[] columnSums = new int[4];


            int rowIndex = 0;
            for (int[] row : matrix) {
                int colIndex = 0;
                for (int num : row) {
                    columnSums[colIndex] += num;
                    colIndex++;
                }
                rowIndex++;
            }


            System.out.println("Sum of each column:");
            for (int i = 0; i < columnSums.length; i++) {
                System.out.println("Column " + (i + 1) + ": " + columnSums[i]);
            }
        }
    }

