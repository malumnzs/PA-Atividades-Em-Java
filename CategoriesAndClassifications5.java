package org.JavaMalu;

import java.util.Scanner;

public class CategoriesAndClassifications5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperatura;

        System.out.println("Digite a temperatura: ");
        temperatura = sc.nextInt();

        if (temperatura <= 15){
            System.out.println("Temperatura fria!");
        }
        if (temperatura >= 16 && temperatura <=22){
            System.out.println("Temperatura fresca!");
        }
        if (temperatura >= 23 && temperatura <= 26){
            System.out.println("Temperatura agradável!");
        }
        if (temperatura >= 27){
            System.out.println("Temperatura alta!");
        }
        }
    }

