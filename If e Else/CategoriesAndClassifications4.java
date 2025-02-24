package org.JavaMalu;

import java.util.Scanner;

public class CategoriesAndClassifications4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pressaoSistolica;
        int pressaoDiastolica;

        System.out.println("Digite sua pressão sistólica: ");
        pressaoSistolica = sc.nextInt();

        System.out.println("Digite sua pressão diastólica: ");
        pressaoDiastolica = sc.nextInt();

        if (pressaoSistolica < 120 && pressaoDiastolica < 80) {
            System.out.println("Pressão normal");
        } else if ((pressaoSistolica >= 120 && pressaoSistolica < 140) || (pressaoDiastolica >= 80 && pressaoDiastolica < 90)) {
            System.out.println("Pressão moderada");
        } else {
            System.out.println("Pressão alta");
        }



    }
}
