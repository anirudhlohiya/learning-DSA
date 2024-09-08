import java.util.Scanner;

public class arrayFromPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nums = {0,2,1,5,3,4};
// output should be 0 1 2 3 4 5 because = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[nums[i]] + " ");
        }
    }
}
