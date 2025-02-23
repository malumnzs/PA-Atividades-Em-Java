package org.JavaMalu;

import java.util.Scanner;

public class DoWhile42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Digite uma palavra ou frase: ");
                String texto = sc.nextLine();

                int i = 0;
                do {
                    System.out.println(texto.charAt(i));
                    i++;
                } while (i < texto.length());

                System.out.println("Fim da exibição!");
                sc.close();
            }
        }


