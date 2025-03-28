package ExerciciosTryCatch;

import java.util.Scanner;

public class ExercicioTryCatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Integer num1, num2;
            System.out.println("Enter a number: ");
            num1 = sc.nextInt();

            System.out.println("Enter another number: ");
            num2 = sc.nextInt();

            System.out.println("The result is: " + num1/num2);


        }
        catch (ArithmeticException error) {

            System.out.println("Invalid division!");

        }
        sc.close();


    }

}
