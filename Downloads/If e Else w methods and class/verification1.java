package method1;

public class verification1 {
    public int num;

    public verification1(int num){
        this.num = num;
    }

    public int verification1(){
        if (num < 0){
            System.out.println("The entered number is negative!");
        }
        else if (num > 0) {
            System.out.println("The entered number is positive! ");

        }
        else {
            System.out.println("The number is zero!");
        }
        return num;

}

    public String toString() {
        return "" + verification1();
    }
}
