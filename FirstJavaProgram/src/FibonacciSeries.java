import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number up to which you want to print the series : ");
        int n = scanner.nextInt();
        int first = 0 , second = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.println(first + " ");
            int nextterm = first + second ;
            first = second;
            second = nextterm;
        }
    }
}
