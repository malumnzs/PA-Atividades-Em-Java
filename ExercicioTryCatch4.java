package ExerciciosTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTryCatch4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer number1, number2;
            System.out.println("Enter a number: ");
            number1 = sc.nextInt();

            System.out.println("Enter another number: ");
            number2 = sc.nextInt();

            System.out.println("The sum of this two numbers is: " + number1 + number2);

        }
        catch (InputMismatchException error) {
            System.out.println("ERROR! The entered value is not a number!");
        }
        sc.close();
    }
}
