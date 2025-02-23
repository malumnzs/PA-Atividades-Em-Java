package org.JavaMalu;

import java.util.Scanner;

public class DoWhile43 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite um número inteiro: ");
                int numero = sc.nextInt();

                int soma = 0;

                do {
                    soma += numero % 10;
                    numero /= 10;
                } while (numero > 0);

                System.out.println("A soma dos dígitos é: " + soma);
                sc.close();
            }
        }

    
