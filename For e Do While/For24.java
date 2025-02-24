public class For24 {
    public static void main(String[] args) {
        System.out.println("Sequencia de numeros triangulares ate o decimo termo:");
        int n =10;
        for(int i = 1; i <= n; i++){
            int numTriangulo = i * (i + 1) / 2;
            System.out.println(i + "º termo: " + numTriangulo);
        }
    }
}
