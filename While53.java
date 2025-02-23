package DoWhile;

public class Ativ_53 {
    public static void numerosTriangulares() {
        int n = 1, termo = 1;
        do {
            System.out.println(termo);
            n++;
            termo += n;
        } while (n <= 10);
    }
}