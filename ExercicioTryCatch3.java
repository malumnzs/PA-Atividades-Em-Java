package ExerciciosTryCatch;

import java.util.Scanner;

public class ExercicioTryCatch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            Integer number;
            System.out.println("--Calculate the square root--");
            System.out.println("Enter a number : ");
            number = sc.nextInt();
            if (number < 0){
                throw new IllegalArgumentException("ERROR! Negative number entered!");
            }
            System.out.println("The square root is: " + Math.sqrt(number));
        } catch (IllegalArgumentException error) {

            System.out.println(error.getMessage());

        }


    sc.close();
    }


}

