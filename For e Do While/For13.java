package For;

public class For13 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;
        System.out.println("Os 10 primeiros termos da sequência de Fibonacci são: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximoTermo = a + b;
            a = b;
            b = proximoTermo;
        }
    }
}
