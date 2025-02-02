package org.program;

import java.util.Scanner;

public class EverydaySituations5{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usuarioValido = "admin";
        String senhaValida = "1234";

        System.out.print("Digite o nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        if (usuario.equals(usuarioValido) && senha.equals(senhaValida)) {
            System.out.println("Acesso concedido! Bem-vindo ao sistema.");
        } else {
            System.out.println("Usuário ou senha incorretos. Acesso negado.");
        }

    }
}
