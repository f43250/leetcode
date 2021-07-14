package 解码异或后的数组;

import java.util.Arrays;

/**
 * @author FLE
 * @description 未知 整数数组 arr 由 n 个非负整数组成。  经编码后变为长度为 n - 1 的另一个整数数组 encoded ，其中 encoded[i] = arr[i] XOR arr[i + 1] 。
 * 例如，arr = [1,0,2,1] 经编码后得到 encoded = [1,2,3] 。给你编码后的数组 encoded 和原数组 arr 的第一个元素 first（arr[0]）。  请解码返回原数组 arr 。可以证明答案存在并且是唯一的。
 * 输入：encoded = [1,2,3], first = 1
 * 输出：[1,0,2,1]
 * 解释：若 arr = [1,0,2,1] ，那么 first = 1 且 encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
 */
public class decode {
    public static void main(String[] args) {
        System.err.println(Arrays.toString(decode(new int[]{1, 2, 3}, 1)));
    }

    public static int[] decode(int[] encoded, int first) {
        int[] oriArray = new int[encoded.length + 1];
        oriArray[0] = first;
        for (int i = 1; i < oriArray.length; i++) {
            oriArray[i] = oriArray[i - 1] ^ encoded[i - 1];
        }
        return oriArray;
    }
}
