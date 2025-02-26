package org.JavaMalu;

import java.util.Scanner;

public class eadEx17 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] matrix = new int[3][3]; // Matriz 3x3

            System.out.println("Enter 9 numbers to fill the 3x3 matrix:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Enter number for position [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.print("\nEnter a scalar number to multiply the matrix: ");
            int scalar = sc.nextInt();

            System.out.println("\nResulting matrix after multiplication:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] *= scalar;
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            sc.close();
        }
    }


