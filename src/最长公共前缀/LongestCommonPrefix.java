package 最长公共前缀;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        StringBuilder resultStr = new StringBuilder();
        for (int j =0; j<prefix.length();j++) {
            for (String str : strs) {
                if (prefix.charAt(j) == str.charAt(j)) {
                    resultStr.append(prefix.charAt(j));
                } else {
                    prefix = prefix.substring(0, prefix.length() - 1);
                }
            }
        }
        return resultStr.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String commonPrefix = longestCommonPrefix(strings);
        System.err.println(commonPrefix);
    }
}
