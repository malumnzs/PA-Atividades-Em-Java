package ExercicioTryCatch9;

public class TemperaturaInvalidaException extends Exception {
    public TemperaturaInvalidaException (){
        super("ERROR! Invalid temperature!");
    }
}
