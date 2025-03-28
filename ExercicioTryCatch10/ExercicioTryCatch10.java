package ExercicioTryCatch10;

import java.util.Scanner;

public class ExercicioTryCatch10 {
public static int factorial(int n) {
    if (n == 0)
        return 1;
    return n * factorial(n - 1);
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer numberUser;
            System.out.println("Enter a number: ");
            numberUser = sc.nextInt();



             if (numberUser < 0){
                 throw new NumeroNegativoException();
             }
             if (numberUser > 20){
                 throw new LimiteFatorialExcedidoException();
             }

             Integer result = factorial(numberUser);
            System.out.println(numberUser + "! = " + result);



        } catch (NumeroNegativoException error) {
            System.out.println(error.getMessage());
        }
        catch (LimiteFatorialExcedidoException error){
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}
