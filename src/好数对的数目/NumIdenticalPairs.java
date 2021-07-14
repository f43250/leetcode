package 好数对的数目;

/**
 * @author FLE
 * @description 给你一个整数数组 nums 。如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。返回好数对的数目。
 * 例如Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * @time 2021/1/21 16:29
 */
public class NumIdenticalPairs {
    public static void main(String[] args) {
        System.err.println(numIdenticalPairs(new int[] {1,2,3,1,1,3}));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) count++;
            }
        }
        return count;
    }
}
