package method1;

import java.util.Scanner;

public class program1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            verification1 verificacao = new verification1 (num);
            verificacao.verification1();

            sc.close();


        }
    }
