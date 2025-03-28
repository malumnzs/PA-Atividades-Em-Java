package org.JavaMalu;

import java.util.Scanner;

public class eadEx12 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matrix = new int[3][3];
            int sum = 0;

            System.out.println("Enter 9 numbers to fill the 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter number for position [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    sum += matrix[i][j];
                }
            }

            System.out.println("\nSum of all elements in the matrix: " + sum);

            sc.close();
        }
    }

