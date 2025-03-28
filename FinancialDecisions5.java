package org.JavaMalu;

import java.util.Scanner;

public class FinancialDecisions5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextInt();

        if (valorCompra >= 150){
            System.out.println("O cliente ganha um brinde!");
        }
        else {
            System.out.println("Cliente não ganha brinde!");
        }

    }
}
