package 整数翻转;

public class Reverse {
    public static int reverse(int x) {
        String xStr = String.valueOf(x);
        xStr = Reverse.replaceZero(xStr);
        Long resultFirst;
        if (xStr.startsWith("-")) {
            resultFirst = Long.valueOf("-" + new StringBuffer(xStr.replace("-", "")).reverse());
        } else {
            resultFirst = Long.valueOf(new StringBuffer(xStr).reverse().toString());
        }
        if (resultFirst < Integer.MIN_VALUE || resultFirst > Integer.MAX_VALUE) {
            return 0;
        } else {
            return Integer.parseInt(resultFirst.toString());
        }
    }

    public static String replaceZero(String xStr) {
        if (!xStr.startsWith("0") && xStr.endsWith("0")) {
            xStr = xStr.substring(0, xStr.length() - 1);
            replaceZero(xStr);
        }
        return xStr;
    }

    public static void main(String[] args) {
        System.err.println(reverse(-2147483412));
    }
}
