package method5;

public class verification5 {
    public double salary;

    public verification5(double salary){
        this.salary = salary;
    }


    public double verification5(){
        if (salary >= 3000) {
            System.out.println("You can finance a property!");
        } else {
            System.out.println("You cannot finance a property!");

        }
        return salary;

    }
}
