package org.JavaMalu;

import java.util.Scanner;

public class AvgNotes5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1;
        int nota2;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextInt();

        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextInt();

        if (nota1 < 10 && nota2 < 10) {
            System.out.println("Reprovado nas duas matérias!");
        }
        if (nota1 >= 10 && nota2 >=10){
            System.out.println("Aprovado nas duas matérias!");
        }
        if (nota1 < 10 && nota2 >= 10){
            System.out.println("Reprovado na matéria 1 e aprovado na matéria 2");
        }
        else {
            System.out.println("Aprovado na matéria 1 e reprovado na matéria 2");
        }
    }
}
