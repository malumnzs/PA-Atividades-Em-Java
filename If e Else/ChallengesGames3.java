package org.casa.br;

import java.util.Scanner;

public class ChallengesGames3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNumber = 7;  // You can change this to any number you want
        System.out.print("Guess the secret number: ");
        int userGuess = sc.nextInt();

        if (userGuess == secretNumber) {
            System.out.println("Congratulations! You guessed the secret number.");
        } else {
            System.out.println("Sorry, that's not the secret number.");
        }
    }
}
