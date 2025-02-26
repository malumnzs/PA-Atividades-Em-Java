package method4;

public class verification4 {
    public int age;

    public verification4(int age){
        this.age = age;
    }

    public double verification4(){
        if (age <= 12) {
            System.out.println("You are a child!");
        } else if (age >= 13 && age <= 17){
            System.out.println("You are a teenager!");
        }
        else if(age >= 18 && age <= 59){
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are an old person!");
        }
        return age;

    }

}
