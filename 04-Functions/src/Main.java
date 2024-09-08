import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
//        int ans = sum(20,30);
//        System.out.println(ans);
        fun();

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

//    static String greet() {
//        String greeting = "How are you";
//        return greeting;
//    }
//    static int sum(int a , int b){
//        int ans = a + b;
//        return ans;
//    }
}