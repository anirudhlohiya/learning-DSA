import java.util.Scanner;

public class inputName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name = ");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
