package org.JavaMalu;

import java.util.Scanner;

public class Math4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1; //variáveis dos números
        int num2;
        int num3;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextInt();

        int soma = num1 + num2 + num3;

        if (soma == 180){
            System.out.println("Esses números podem formar um triângulo!");
        }
        else{
            System.out.println("Esses números não podem formar um triângulo");
        }

        }
    }

