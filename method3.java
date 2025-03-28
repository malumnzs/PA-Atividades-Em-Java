package CriacaoDeMetodos;

import java.util.Scanner;

public class method3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first number : ");
        double num1 = sc.nextDouble();

        System.out.println("Type the second one: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;

        String check = verification(sum);
        System.out.println(check);

        sc.close();


    }
    public static String verification(double sum) {
        String verify;
        if (sum > 100) {
            verify = "The result of the sum is greater than 100";
        } else {
            verify = "The result of the sum is not greater than 100!";
        }
        return verify;
    }
}

