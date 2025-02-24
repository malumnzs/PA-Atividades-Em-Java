package org.JavaMalu;

import java.util.Scanner;

public class DoWhile41 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Digite uma palavra ou frase: ");
                String texto = sc.nextLine();

                int i = 0;
                do {
                    System.out.println(texto.charAt(i));
                    i++; // Incrementa o índice
                } while (i < texto.length());

                System.out.println("Fim da exibição!");
                sc.close();
            }
        }
