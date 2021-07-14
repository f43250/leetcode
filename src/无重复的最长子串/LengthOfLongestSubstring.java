package 无重复的最长子串;

/**
 * @author FLE
 * @description 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是"wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke"是一个子序列，不是子串。
 * @time 2021/1/25 11:28
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.err.println(lengthOfLongestSubstring("anviaj"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        if ("".equals(s)) {
            return max;
        }else if (" ".equals(s)){
            return 1;
        }
        StringBuilder str = new StringBuilder();

        String[] split = s.split("");
        if (s.length() == 1) {
            return 1;
        }
        for (int i = 0; i < split.length; i++) {
            if (str.toString().contains(split[i])) {
                int newMax = str.length();
                if (newMax > max) {
                    max = newMax;
                }
                System.err.println(str.substring(str.length() - 1));
                System.err.println(split[i]);
                if (!str.substring(str.length() - 1).equals(split[i])){
                    str = new StringBuilder(str.substring(str.length() - 1) + split[i]);
                }else {
                    str = new StringBuilder( split[i]);
                }
            }else {
                if (i == 0 ){
                    str = new StringBuilder(split[0]);
                }else {
                    str.append(split[i]);
                }
                max = str.length();
            }
        }
        return max;
    }
}
