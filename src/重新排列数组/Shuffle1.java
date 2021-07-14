package 重新排列数组;

import java.util.Arrays;

/**
 * @author FLE
 * @description 奇偶思路
 * @time 2021/1/22 14:39
 */
public class Shuffle1 {
    public static void main(String[] args) {
        // 2 3 5 4 1 7
        System.err.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[2 * n];
        for (int i = 0; i < n; i++) {
            newArray[i] = nums[i];
            newArray[i + 1] = nums[n + i];
        }
        return newArray;
    }
}
