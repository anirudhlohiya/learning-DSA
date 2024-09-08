import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number = ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd number = ");
        int second = scanner.nextInt();
        System.out.print("Enter 3rd number = ");
        int third = scanner.nextInt();
        int greatest = largest(first, second, third);
        System.out.println("Largest = " + greatest);
        int lowest = lowest(first,second,third);
        System.out.print("Lowest = " + lowest);
    }

    static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }

    static int lowest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}
