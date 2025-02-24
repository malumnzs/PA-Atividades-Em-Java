package CriacaoDeMetodos;

import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String check = verification(num);
        System.out.println(check);


    }
    public static String verification(int num) {
        String verify;
        if (num < 0){
             verify = "The entered number is negative!";
        }
        else if (num > 0) {
           verify = "The entered number is positive! ";

        }
        else {
            verify = "The number is zero!";
        }
        return verify;
    }
}

