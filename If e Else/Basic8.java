package org.salatarde.br;

import java.util.Scanner;

public class Basic8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        char character = sc.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println("This letter is a vowel !");
        }
else {
            System.out.println("This letter not is vowel!");
        }
    }
}