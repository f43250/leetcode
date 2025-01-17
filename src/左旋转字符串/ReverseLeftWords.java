package 左旋转字符串;

/**
 * @author FLE
 * @description 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"
 * @time 2021/1/21 15:59
 */
public class ReverseLeftWords {
    public static void main(String[] args) {
        System.err.println(reverseLeftWords("abcdefg", 2));
    }

    public static String reverseLeftWords(String s, int n) {
        String str = s.substring(0, n);
        return s.substring(n) + str;
    }
}
