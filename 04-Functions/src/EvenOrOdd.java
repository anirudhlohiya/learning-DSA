import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean evenOrOdd = evenOdd(number);
        System.out.println(evenOrOdd ? "Even" : "Odd");
//        System.out.print(evenOrOdd ? "Even" : "Odd");

    }
    static boolean evenOdd(int number){
        boolean evenOdd;
        evenOdd = number % 2 == 0;
        return evenOdd;
    }
}
