package method3;

public class verification3 {
    public double note1;
    public double note2;
    public double sum;

    public verification3(double note1, double note2, double sum) {
        this.note1 = note1;
        this.note2 = note2;
    }

    public double verification3() {


        if (sum > 100) {
            System.out.println("The result of the sum is greater than 100");

        } else {
            System.out.println("The result of the sum is not greater than 100!");
        }
        return sum ;
    }

    public String toString() {
        return  ""  +
                verification3();
    }
}

