package DoWhile;

public class Ativ_51 {
    public static void numerosPerfeitos() {
        int count = 0, num = 1;
        do {
            int soma = 0, i = 1;
            do {
                if (num % i == 0) soma += i;
                i++;
            } while (i < num);
            if (soma == num) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10);
    }
}