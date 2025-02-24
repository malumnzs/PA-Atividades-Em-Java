package CriacaoDeMetodos;

import java.util.Scanner;

public class method5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type your salary : ");
        double salary = sc.nextInt();

        String check = verification(salary);
        System.out.println(check);

        sc.close();

    }
    public static String verification(double salary) {
        String verify;

        if (salary >= 3000) {
            verify = "You can finance a property!";
        } else {
            verify = "You cannot finance a property!";

        }
        return verify;
    }
}

