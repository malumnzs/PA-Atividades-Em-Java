package org.JavaMalu;

import java.util.Scanner;

public class eadEx13 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            int max = Integer.MIN_VALUE;

            System.out.println("Enter 9 numbers to fill the 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter number for position [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                }
            }

            System.out.println("\nThe largest element in the matrix is: " + max);

            sc.close();
        }
    }
