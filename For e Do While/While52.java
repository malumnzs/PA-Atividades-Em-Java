package DoWhile;

public class Ativ_52 {
    public static void primeirosPrimos() {
        int count = 0, num = 2;
        do {
            boolean primo = true;
            int i = 2;
            do {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
                i++;
            } while (i <= Math.sqrt(num));
            if (primo) {
                System.out.println(num);
                count++;
            }
            num++;
        } while (count < 10);
    }
}