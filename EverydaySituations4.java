package org.program;

import java.util.Scanner;

public class EverydaySituations4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        int peso;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite seu peso: ");
        peso = sc.nextInt();

        if (idade >=18 && idade <= 65 && peso >= 50){
            System.out.println("Pessoa está apta a doar sangue!");
        }
        else{
            System.out.println("Essa pessoa não está apta a doar sangue!");
        }


    }
}
