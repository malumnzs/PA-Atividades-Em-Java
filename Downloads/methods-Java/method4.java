package CriacaoDeMetodos;

import java.util.Scanner;

public class method4 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Type your age: ");
            int age = sc.nextInt();



            String check = verification(age);
            System.out.println(check);



            sc.close();


        }
        public static String verification(int age) {
            String verify;
            if (age <= 12) {
                verify = "You are a child!";
            } else if (age >= 13 && age <= 17){
                verify = "You are a teenager!";
            }
            else if(age >= 18 && age <= 59){
                verify = "You are an adult!";
            }
            else {
                verify = "You are an old person!";
            }
            return verify;
        }
    }

