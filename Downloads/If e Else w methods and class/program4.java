package method4;


import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your age: ");
        int age = sc.nextInt();

        verification4 verificacao4 = new verification4 (age);
        verificacao4.verification4();

        sc.close();

    }
}
