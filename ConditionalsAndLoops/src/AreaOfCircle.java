import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radius = scanner.nextInt();
        double result = Math.PI * radius * radius;
        System.out.println("Area of circle  = " + result);
    }
}
