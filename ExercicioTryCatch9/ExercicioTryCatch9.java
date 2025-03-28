package ExercicioTryCatch9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExercicioTryCatch9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Integer temperature;
            System.out.println("Enter a temperature in degrees Celsius: ");
            temperature = sc.nextInt();

            if (temperature < -273.5 ) {

                throw new TemperaturaInvalidaException();
            }
            else{
                System.out.println("The temperature in degrees Fahrenheit is " + (temperature * 1.8 + 32));
            }

        }catch (TemperaturaInvalidaException error ){
            System.out.println(error.getMessage());
        }
        catch (InputMismatchException error ){
            System.out.println("ERROR!Invalid value entered!");
        }
        sc.close();

    }
}
