package org.JavaMalu;

import java.util.Scanner;

public class FinancialDecisions4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salario, valorProduto, parcelas;

        System.out.println("Digite o valor do salário: ");
        salario = sc.nextInt();

        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextInt();

        System.out.println("Digite o número de parcelas: ");
        parcelas = sc.nextInt();

        double valorParcelas = valorProduto / parcelas;
        if (valorParcelas <= 0.1 * salario) {
            System.out.println("A compra pode ser parcelada!");
        }
        else {
            System.out.println("A compra não pode ser parcelada");
        }
    }
}
