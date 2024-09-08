import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter Principle Amount = ");
        int principle = scanner.nextInt();
        System.out.printf("Enter Rate of Interest = ");
        float interest = scanner.nextFloat();
        System.out.printf("Enter Time In Years = ");
        int time = scanner.nextInt();

        float SimpleInterest = (principle*interest*time/100);
        System.out.println("Your Simple Intrest = " + SimpleInterest);

    }

}