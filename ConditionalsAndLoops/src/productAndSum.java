public class productAndSum {
    public static void main(String[] args) {
        int n = 234;
        int product = 1;
        int sum = 0;
        while (n>0){
            int mul = n % 10;
            product *= mul;
            sum += mul;
            n /= 10;
        }
        int result = product - sum;
        System.out.println(result);
    }
}
