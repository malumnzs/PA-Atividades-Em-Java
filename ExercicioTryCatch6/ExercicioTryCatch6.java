package ExerciciosTryCatch.ExercicioTryCatch6;

import java.util.Scanner;

public class ExercicioTryCatch6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            Integer age;
            String name;

            System.out.println("Enter a name: ");
            name = sc.nextLine();

            if (name.isEmpty() )  {
                throw  new DadosInvalidosException();

            }

            System.out.println("Enter a age: ");
            age = sc.nextInt();
            if (age < 0){
                throw new DadosInvalidosException();
            }
            else {
                System.out.println("Register successful!");

            }

        } catch (DadosInvalidosException error){
            error.printStackTrace();
        }
        sc.close();
    }
}
