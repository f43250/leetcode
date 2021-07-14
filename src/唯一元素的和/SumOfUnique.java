package 唯一元素的和;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FLE
 * @description 给你一个整数数组 nums 。数组中唯一元素是那些只出现 恰好一次 的元素。  请你返回 nums 中唯一元素的 和 。
 * @time 2021/2/7 15:33
 */
public class SumOfUnique {

    public static void main(String[] args) {
        System.err.println(sumOfUnique(new int[]{1, 2,3,2}));
    }

    public static int sumOfUnique(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            int current = nums[i];
            for (int i1 = 1; i < nums.length -1; i++) {
                if (current == nums[i1]) {
                    count++;
                }
            }
            if (count == 1) {
                array[i] = nums[i];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        return 0;
    }
}
