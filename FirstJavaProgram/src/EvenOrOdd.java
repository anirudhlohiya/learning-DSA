import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0 ){
            System.out.println(number + " is a even number");
        }
        else {
            System.out.printf(number + " is a odd number");
        }
    }
}
