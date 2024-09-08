package Medium;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you units consumed = ");
        Float units = input.nextFloat();
        double bill;
        if (units<=100){
            bill = 4 * units;
        } else if (units>100 && units<=300) {
            bill = 100 * 4 + (units-100) * 6;
        } else {
            bill = 100 * 4 + (units-100) * 6 + (units-300) * 8;
        }
        System.out.println("Your bill for " + units + " units = " + bill);
    }
}