package org.program;

import java.util.Scanner;
import java.util.Random;

public class ChallengeGames5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeroSorteado = random.nextInt(10) + 1;
        System.out.print("Tente adivinhar o número entre 1 e 10: ");
        int palpite = sc.nextInt();

        if (palpite == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número.");
        } else {
            System.out.println("Que pena, você errou. O número sorteado era: " + numeroSorteado);
        }

    }
}
