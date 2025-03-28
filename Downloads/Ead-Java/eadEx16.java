package org.JavaMalu;

import java.util.Scanner;

public class eadEx16 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the identity matrix (N): ");
            int n = sc.nextInt();

            System.out.println("\nIdentity Matrix " + n + "x" + n + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }

            sc.close();
        }
    }


