package method5;

import method4.verification4;

import java.util.Scanner;

public class program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your salary : ");
        double salary = sc.nextInt();

        verification5 verificacao5 = new verification5 (salary);
        verificacao5.verification5();

        sc.close();


    }
}
