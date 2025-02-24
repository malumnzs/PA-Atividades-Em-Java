package org.salatarde.br;

import java.util.Scanner;

public class Basic5 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a first number: ");
    int num1 = sc.nextInt();
    System.out.print("Enter a second number: ");
    int number2 = sc.nextInt();
    System.out.print("Enter a third number: ");
    int number3 = sc.nextInt();

    int big = num1;

    if (number2 > big) {
        big = number2;
    }
    if (number3 > big) {
        big = number3;
    }

    System.out.println("The biggest number is: " + big);
}
}