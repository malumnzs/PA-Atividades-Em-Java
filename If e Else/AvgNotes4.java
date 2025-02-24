package org.JavaMalu;

import java.util.Scanner;

public class AvgNotes4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota (1 a 15): ");
        int nota = sc.nextInt();

        if (nota == 15){
            System.out.println("Parabéns, você tirou a nota máxima e foi aprovado!");
        }
        if (nota >= 10) {
            System.out.println("Aprovado!");

        }
        else{
            System.out.println("Reprovado!");
        }


    }

}
