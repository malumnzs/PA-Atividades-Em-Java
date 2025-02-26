package org.JavaMalu;

public class eadEx28 {

        public static void main(String[] args) {
            int[][] matrix = {
                    {5, 12, 9},
                    {3, 18, 7},
                    {14, 2, 11}
            };

            int max = matrix[0][0];


            for (int[] row : matrix) {
                for (int num : row) {
                    if (num > max) {
                        max = num;
                    }
                }
            }

            System.out.println("The largest element in the matrix is: " + max);
        }
    }

}
