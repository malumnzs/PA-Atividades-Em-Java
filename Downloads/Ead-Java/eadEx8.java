package org.JavaMalu;

import java.util.Scanner;
import java.util.Arrays;

public class eadEx8 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // Scanner nomeado como 'sc'
            String[] names = new String[5];

            System.out.println("Enter 5 names:");
            for (int i = 0; i < names.length; i++) {
                System.out.print("Name " + (i + 1) + ": ");
                names[i] = sc.nextLine();
            }

            Arrays.sort(names);

            System.out.println("\nSorted names:");
            for (String name : names) {
                System.out.println(name);
            }

            sc.close();
        }
    }

