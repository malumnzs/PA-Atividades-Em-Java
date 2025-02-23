package DoWhile;

import java.util.Random;

public class Ativ_49 {
    public static void gerarSenha() {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String senha = "";
        int i = 0;
        do {
            senha += caracteres.charAt(random.nextInt(caracteres.length()));
            i++;
        } while (i < 6);
        System.out.println("Senha gerada: " + senha);
    }

}