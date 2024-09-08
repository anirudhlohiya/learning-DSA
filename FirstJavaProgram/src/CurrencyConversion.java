import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any amount in rupees : ");
        int currency = scanner.nextInt();
        int usdCurrency = currency * 82;
        System.out.println("Converted currency in usd = " + usdCurrency + "$");
    }
}
