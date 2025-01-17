package 拿硬币;

/**
 * @author FLE
 * @description 桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。
 * @time 2021/2/2 15:28
 */
public class MinCount {
    public static void main(String[] args) {
        System.err.println(minCount(new int[]{4, 2, 1}));
    }

    public static int minCount(int[] coins) {
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] % 2 == 0) {
                count = count + coins[i] / 2;
            }else {
                count = count + coins[i] / 2 + 1;
            }
        }
        return count;
    }
}
