import java.util.Scanner;

public class SumOfTwoNumebers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int first = scanner.nextInt();
        System.out.print("Enter 2nd number : ");
        int second = scanner.nextInt();
        int result = addition(first,second);
        System.out.print("Addition = " + result);
    }
    static int addition(int num1, int num2){
        int sum = num1 + num2 ;
        return sum;
    }
}
