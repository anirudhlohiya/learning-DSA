import java.util.Arrays;
import java.lang.System;

public class Concatenation {
    public static void main(String[] args) {    
        // concatenation of same array twice
        int[] arr = {1, 2, 1};
        int[] result = new int[arr.length * 2];
        System.arraycopy(arr,0,result,0,arr.length);
        System.arraycopy(arr,0,result,arr.length,arr.length);
        System.out.println(Arrays.toString(result));
    }

}
