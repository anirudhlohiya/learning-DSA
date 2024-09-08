import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = input.nextInt();
        int sum = sum(number);
        System.out.print("Sum of all numbers = " + sum);
    }

    static int sum(int n){
        int total = 0;
        for (int i = 0; i <= n ; i++) {
            total +=i;
        }
        return total;
    }
}
