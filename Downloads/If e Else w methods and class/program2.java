package method2;


import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first note : ");
        double note1 = sc.nextDouble();

        System.out.println("Type the second one: ");
        double note2 = sc.nextDouble();

        double average = (note1 + note2) / 2;

        verification2 verificacao2 = new verification2 (note1, note2, average);
        verificacao2.verification2();

        sc.close();

    }
}
