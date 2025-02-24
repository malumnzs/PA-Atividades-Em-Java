public class For30 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 6, 8};
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de numeros pares:" + pares);
        System.out.println("Quantidade de numeros impares:" + impares);

    }

}
