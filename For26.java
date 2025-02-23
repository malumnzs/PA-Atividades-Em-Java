public class For26 {
    public static void main(String[] args) {
        int b = 5;
        int n = b / 2 +1;

        for (int i =1; i<= n; i++){
            for (int j = 1; j < n; j++){
                System.out.println("");
            }
            for (int j = 1; j <= (2* 1 - 1); j++){
                System.out.println(j);
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.println("");
            }
            for (int j = 1; j <= (2 * i - 1); j++){
                System.out.println(j);

            }
            System.out.println();
        }
    }
}
