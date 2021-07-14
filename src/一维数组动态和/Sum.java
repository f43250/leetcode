package 一维数组动态和;

import java.util.Arrays;

/**
 * @author FLE
 * @description 一维数组动态和
 * @time 2021/1/20 15:39
 */
public class Sum {
    public static void main(String[] args) {
        int[] intArray = {1,2,5,109};
        System.err.println(Arrays.toString(runningSum(intArray)));
    }

    public static int[] runningSum(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                newArray[i] = nums[i];
            }else {
                int midSum = 0;
                for (int j = 0; j <= i; j++) {
                    midSum = midSum + nums[j];
                }
                newArray[i] = midSum;
            }
        }
        return newArray;
    }
}
