import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter you age = ");
        age = scanner.nextInt();
        boolean isEligible = vote(age);
        System.out.print(isEligible ? "Eligible" : "Not Eligible");
    }
    static boolean vote(int age){
        boolean eligible;
        eligible = age >= 18;
        return eligible;
    }
}
