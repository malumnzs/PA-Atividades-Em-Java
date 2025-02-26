package method2;

public class verification2 {
    public double note1;
    public double note2;
    public double average;


    public verification2(double note1, double note2, double average){
        this.note1 = note1;
        this.note2 = note2;
        this.average = average;
    }

    public double verification2(){
        if (average >= 7) {
            System.out.println("The student is approved!");
        } else {
            System.out.println("The student is not approved!");
        }
        return average;
    }

}


