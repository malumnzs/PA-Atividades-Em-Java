package method3;


import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Type the second one: ");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;

        verification3 verificacao3 = new verification3(num1, num2, sum);
        verificacao3.verification3();

        sc.close();

    }

}

