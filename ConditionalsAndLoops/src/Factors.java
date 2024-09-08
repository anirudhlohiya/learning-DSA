import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an number = ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
