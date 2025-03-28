package ExerciciosTryCatch.ExerciciosTryCatch8;

import java.util.Scanner;

public class ExercicioTryCatch8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            Integer age;
            System.out.println("Enter you age: ");
            age = sc.nextInt();

            if (age < 0){
                throw new IdadeInvalidaException();
            }
            if (age >= 18){
                System.out.println("You are of legal age!");
            }
            if (age >= 1 && age <= 17){
                System.out.println("You are not of legal age!");
            }
        } catch (IdadeInvalidaException error) {
            System.out.println("ERROR!Invalid data entered!");
            error.printStackTrace();
        }
        sc.close();
    }
}
