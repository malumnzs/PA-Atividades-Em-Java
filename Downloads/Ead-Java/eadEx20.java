package org.JavaMalu;

import java.util.Scanner;

public class eadEx20 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matrix = new int[4][4];
            int[] rowSums = new int[4];
            int[] colSums = new int[4];

            System.out.println("Enter 16 numbers to fill the 4x4 matrix:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Enter number for position [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    rowSums[i] += matrix[i][j];
                    colSums[j] += matrix[i][j];
                }
            }


            System.out.println("\nMatrix:");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("\nSum of each row:");
            for (int i = 0; i < 4; i++) {
                System.out.println("Row " + (i + 1) + ": " + rowSums[i]);
            }

            System.out.println("\nSum of each column:");
            for (int j = 0; j < 4; j++) {
                System.out.println("Column " + (j + 1) + ": " + colSums[j]);
            }

            sc.close();
        }
    }


