import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int largest = 0;
        do {
            System.out.print("Enter the number = ");
            number = scanner.nextInt();
            if (number>largest){
                largest = number;
            }
        } while (number != 0);
        System.out.println(largest + " is the largest number");
    }
}
