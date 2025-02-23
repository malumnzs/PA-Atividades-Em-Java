

public class For28 {
    public static void main(String[] args) {
        int [] vetor = {4,8,12,16,20};
        int soma = 0;

        for(int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        double media =(double) soma/ vetor.length;
        System.out.println("A média dos números do vetor é: " + media);

    }

}
