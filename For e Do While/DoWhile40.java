package org.JavaMalu;

import java.util.Scanner;

public class DoWhile40 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numero;
            int contador = 0;

            System.out.println("Digite números (digite 0 para sair):");

            do {
                numero = sc.nextInt();

                if (numero != 0) {
                    contador++;
                }

            } while (numero != 0);

            System.out.println("Você digitou " + contador + " números antes de digitar zero.");
            sc.close();
        }
    }


