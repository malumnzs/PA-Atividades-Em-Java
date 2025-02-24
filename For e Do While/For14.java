package For;

public class For14 {
    public static void main(String[] args) {
        System.out.println("Números primos entre 1 e 50:");

        for (int num = 2; num <= 50; num++) {
            boolean primo = true;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.print(num + " ");
            }
    }
}
}
