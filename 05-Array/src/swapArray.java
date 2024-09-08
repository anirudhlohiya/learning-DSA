import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = {32,454,54,58,69};
        swap(arr,1,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
