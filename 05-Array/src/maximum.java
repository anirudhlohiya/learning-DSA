import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        int[] arr = {32,34,553,322,433,2343};
        int max = max(arr);
        System.out.println("max = " + max);

    }

    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
