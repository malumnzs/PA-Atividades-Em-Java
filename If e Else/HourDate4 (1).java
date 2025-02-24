package org.JavaMalu;

import java.util.Scanner;

public class HourDate4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horario;

        System.out.println("Digite o horário(neste formato '11.32'): ");
        horario = sc.nextDouble();

        if (horario >= 00.00 && horario <= 11.59 ){
            System.out.println("Está de manhã!");
        }
        if (horario >= 12.00 && horario <= 17.59){
            System.out.println("Está de tarde!");
        }
        if (horario >= 18 && horario <= 23.59){
            System.out.println("Está de noite!");
        }
    }
}
