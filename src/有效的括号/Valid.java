package 有效的括号;

public class Valid {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || "".equals(s)) {
            return false;
        }
        StringBuilder str = new StringBuilder(s);
        for (var i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == '{' && s.charAt(i + 1) == '}') || (s.charAt(i) == '[' && s.charAt(i + 1) == ']') || (s.charAt(i) == '(' && s.charAt(i + 1) == ')')) {
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                if ("".equals(str.toString())) {
                    return true;
                }
                return isValid(str.toString());
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.err.println(isValid("(("));
    }
}
