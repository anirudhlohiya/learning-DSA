import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you marks(0-100) = ");
        int marks = input.nextInt();
        String grade = result(marks);
        System.out.print("Grade = " + grade);
    }

    static String result(int marks) {
        marks /= 10;
        switch (marks) {
            case 10 -> {
                return "AA";
            }
            case 9 -> {
                return marks == 90 ? "AB" : "AA";
            }
            case 8 -> {
                return marks == 80 ? "BB" : "AB";
            }
            case 7 -> {
                return marks == 70 ? "BC" : "BB";
            }
            case 6 -> {
                return "BC";
            }
            default -> {
                return "fail";
            }
        }
    }
}
