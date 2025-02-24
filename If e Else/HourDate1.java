package org.casa.br;
import java.util.Scanner;
public class HourDate1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time (HH:mm): ");
        String time = sc.nextLine();

        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        if (hours >= 0 && hours <= 23 && minutes >= 0 && minutes <= 59) {
            System.out.println("Valid time.");
        } else {
            System.out.println("Invalid time.");
        }
    }
}
