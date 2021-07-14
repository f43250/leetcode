package 统计一致字符串的数目;

import java.util.Arrays;

/**
 * @author FLE
 * @description 给你一个由不同字符组成的字符串allowed和一个字符串数组words。
 * 如果一个字符串的每一个字符都在 allowed中，就称这个字符串是 一致字符串 。  请你返回words数组中一致字符串的数目。
 * 输入：allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * 输出：2
 * 解释：字符串 "aaab" 和 "baa" 都是一致字符串，因为它们只包含字符 'a' 和 'b' 。
 * @time 2021/1/25 10:24
 */
public class CountConsistentStrings {
    public static void main(String[] args) {
        countConsistentStrings("aaaaa", new String[]{"a", "b"});
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            Boolean[] flag = new Boolean[word.length()];
            Arrays.fill(flag, false);
            String[] splitStr = word.split("");
            for (int k = 0; k < splitStr.length; k++) {
                if (allowed.contains(splitStr[k])) {
                    flag[k] = true;
                }
            }
            if (!Arrays.asList(flag).contains(false)) count++;

        }
        return count;
    }
}
