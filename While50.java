package DoWhile;

import java.util.Scanner;

public class Ativ_50 {
    public static void solicitarSenha() {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "senha123";
        String tentativa;
        do {
            System.out.print("Digite a senha: ");
            tentativa = scanner.nextLine();
        } while (!tentativa.equals(senhaCorreta));
        System.out.println("Acesso concedido!");
    }
}