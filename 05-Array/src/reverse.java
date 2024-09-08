import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int arr[] = {12, 32, 34, 323, 54, 33, 45, 76};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swapArray.swap(arr, start, end);
            start++;
            end--;
        }

    }
}
