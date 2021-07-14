package 数组异或操作;

/**
 * @author FLE
 * @description 给你两个整数，n 和 start 。数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length, 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 * @time 2021/1/22 14:55
 */
public class XorOperation {
    public static void main(String[] args) {
        System.err.println(xorOperation(5, 0));
    }

    public static int xorOperation(int n, int start) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = start + 2 * i;
        }
        int result = array[0];
        for (int i = 0; i < n - 1; i++) {
            result = result ^ array[i + 1];
        }
        return result;
    }
}
