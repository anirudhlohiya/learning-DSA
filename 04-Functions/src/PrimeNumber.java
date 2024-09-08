import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number);
        if (number<=1){
            System.out.print("Invalid Input!!");
        }
        else {
            if (isPrime) {
                System.out.print(number + " is a prime number");
            } else {
                System.out.print(number + " is not a prime number");
            }
        }
    }
    static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
