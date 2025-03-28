package ExerciciosTryCatch;

import java.util.Scanner;

public class ExercicioTryCatch5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{

            Integer numbers[] = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
            Integer numberUser;

            System.out.println("Pick a number in array position: ");
            numberUser = sc.nextInt();

            Integer position = numbers[numberUser];
            System.out.println("Value in picked position: " + position);
        }
        catch (ArrayIndexOutOfBoundsException error){
            System.out.println("ERROR!Index out of array limits! ");
        }
        sc.close();

    }

}
