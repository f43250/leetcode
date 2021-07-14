package 重新排列数组;

import java.util.Arrays;

/**
 * @author FLE
 * @description 给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。
 * 请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组
 * @time 2021/1/22 10:00
 */
public class Shuffle {
    public static void main(String[] args) {
        // 2 3 5 4 1 7
        System.err.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums.length; j++) {
                // i = 0->n-1
                // j = 0->length-1
                if (i == j){
                    if (i == 0 ) {
                        newArray[i] = nums[i + j];
                    }else {
                        newArray[i + j] = nums[i];
                    }
                }else if ((j-i) % n == 0) {
                    if (i == 0) {
                        newArray[1] = nums[j];
                    }else {
                        newArray[ 2 * i + 1] = nums[j];
                    }
                }
            }
        }
        return newArray;
    }
}
