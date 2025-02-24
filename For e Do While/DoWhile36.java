package org.JavaMalu;

public class DoWhile36 {
    public static void main(String[] args) {
        int num = 1;
        int soma = 0;
        while (num <= 50) {
            soma += num;
            num++;
        }
        System.out.println("A soma dos números de 1 a 50 é: " + soma);
    }
}
