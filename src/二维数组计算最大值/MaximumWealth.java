package 二维数组计算最大值;

import java.util.Arrays;

/**
 * @author FLE
 * @description 二维数组最大值
 * @time 2021/1/20 16:01
 */
public class MaximumWealth {

    public static void main(String[] args) {
        int[][] array = new int[3][1];
        array[0] = new int[]{1, 5};
        array[1] = new int[]{3, 7};
        array[2] = new int[]{3, 5};
        System.err.println(maximumWealth(array));
    }

    public static int maximumWealth(int[][] accounts) {
        int[] newArray = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            newArray[i] = Arrays.stream(accounts[i]).sum();
        }
        Arrays.sort(newArray);
        return newArray[newArray.length - 1];
    }
}
