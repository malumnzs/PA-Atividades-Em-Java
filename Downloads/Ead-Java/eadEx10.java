package org.JavaMalu;

import java.util.Scanner;

public class eadEx10 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] list1 = new int[5];
            int[] list2 = new int[5];
            int[] mergedList = new int[10];

            System.out.println("Enter 5 numbers for the first list:");
            for (int i = 0; i < list1.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                list1[i] = sc.nextInt();
            }

            System.out.println("\nEnter 5 numbers for the second list:");
            for (int i = 0; i < list2.length; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                list2[i] = sc.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                mergedList[i] = list1[i];
                mergedList[i + 5] = list2[i];
            }


            System.out.println("\nMerged list:");
            for (int num : mergedList) {
                System.out.print(num + " ");
            }

            sc.close();
        }
    }


