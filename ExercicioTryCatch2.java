package ExerciciosTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTryCatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer number;
            System.out.println("Enter a number: ");
            number = sc.nextInt();

            System.out.println("The entered number was: " + number);

        }
        catch (NumberFormatException error){
        }
        catch (InputMismatchException error){
            System.out.println("Invalid number!");
        }
        sc.close();
    }
}
