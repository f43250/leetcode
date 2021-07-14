package 找到最高海拔;

/**
 * @author FLE
 * @description 有一个自行车手打算进行一场公路骑行，这条路线总共由n + 1个不同海拔的点组成。自行车手从海拔为 0的点0开始骑行。
 * 给你一个长度为 n的整数数组gain，其中 gain[i]是点 i和点 i + 1的 净海拔高度差（0 <= i < n）。请你返回 最高点的海拔 。
 * 输入：gain = [-5,1,5,0,-7]
 * 输出：1
 * 解释：海拔高度依次为 [0,-5,-4,1,1,-6] 。最高海拔为 1 。
 * @time 2021/1/26 16:22
 */
public class LargestAltitude {
    public static void main(String[] args) {
        System.err.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        int[] array = new int[gain.length + 1];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + gain[i - 1];
        }
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }
}
