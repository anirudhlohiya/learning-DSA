import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter 1st number = ");
        int num1 = scanner.nextInt();
        System.out.printf("Enter 2nd number = ");
        int num2 = scanner.nextInt();
        if (num1 > num2) System.out.print(num1 + " is greater than " + num2);
        else System.out.print(num2 + " is greater than " + num1);
    }
}