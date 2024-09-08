import java.util.Arrays;
import java.util.Scanner;

public class arrayPrint {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // first way to take input and print output
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.print(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " " + arr[4]);

        // second way to take input and print output
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.print("\n"+arr2[0] + " " + arr2[1] + " " + arr2[2] + " " + arr2[3] + " " + arr2[4]+"\n");

        // third way to take input and print output
//        Scanner scanner = new Scanner(System.in);
//        int[] arr3 = new int[5];
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.print(arr3[i] + " ");
//        }

        // one more way to print
        System.out.println(Arrays.toString(arr2));
    }
}
