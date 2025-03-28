package ExerciciosTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTryCatch7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer num1, num2, num3;
            System.out.println("Enter a number: ");
            num1 = sc.nextInt();

            System.out.println("Enter another number: ");
            num2 = sc.nextInt();

            System.out.println("Enter another number: ");
            num3 = sc.nextInt();

            System.out.println("The average of the entered numbers is: " + (num1 + num2 + num3) / 3);

        }
        catch (InputMismatchException error) {
            System.out.println("ERROR! Invalid number entered!");
        }
        sc.close();
    }
}
