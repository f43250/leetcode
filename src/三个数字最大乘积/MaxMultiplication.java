package 三个数字最大乘积;

import java.util.Arrays;

/**
 * @author FLE
 * @description 数组三个数字最大乘积
 * @time 2021/1/20 14:56
 */
public class MaxMultiplication {
    public static void main(String[] args) {
        int[] array = {-1, 2, 0, 6};
        System.err.println(maximumProduct(array));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int firstMax = nums[size - 1] * nums[size - 2] * nums[size - 3];
        int secondMax = nums[0] * nums[1] * nums[size - 1];
        return Math.max(firstMax, secondMax);
    }

}
