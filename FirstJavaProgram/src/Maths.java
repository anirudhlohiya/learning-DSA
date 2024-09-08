import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number = ");
        int num1 = scanner.nextInt();
        System.out.println("Enter 2nd number = ");
        int num2 = scanner.nextInt();
        System.out.printf("Enter the operand (*,/,+,-)");
        char operand = scanner.next().charAt(0);
        double result;
        if (operand == '+'){
            result = num1 + num2;
            System.out.println(result);
        } else if (operand == '-') {
            result = num1 - num2;
            System.out.println(result);
        } else if (operand == '*') {
            result = num1 * num2;
            System.out.println(result);
        } else if (operand == '/'){
            result = num1 / num2;
            System.out.println(result);
        } else {
            System.out.printf("Invalid Input!!");
        }

    }
}
