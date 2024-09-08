import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        do {
            System.out.print("Enter the numbers [0 to exit ] = ");
            number = scanner.nextInt();
            sum += number;
        } while (number!=0);
        System.out.println("Sum of all numbers = " + sum);
    }
}
