package org.JavaMalu;

public class For7 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1 ; i <= 100; i+= 2) {
            soma += i;
        }
        System.out.println("A soma dos números ímpares de 1 até 100 é = " + soma);
    }
}
