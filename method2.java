package CriacaoDeMetodos;

import java.util.Scanner;

public class method2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Type the first note : ");
            double note1 = sc.nextDouble();

            System.out.println("Type the second one: ");
            double note2 = sc.nextDouble();

            double average = (note1 + note2) / 2;

            String check = verification(average);
            System.out.println(check);

            sc.close();


        }
        public static String verification(double average) {
            String verify;
            if (average >= 7) {
                verify = "The student is approved!";
            } else {
                verify = "The student is not approved!";
            }
            return verify;
        }
    }



