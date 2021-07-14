package 整数的各位积和之差;

/**
 * @author FLE
 * @description 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * @time 2021/2/2 19:59
 */
public class SubtractProductAndSum {

    public static void main(String[] args) {
        System.err.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n) {
        String[] split = String.valueOf(n).split("");
        int multiplication = 0;
        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            if(i == 0) {
                multiplication = Integer.parseInt(split[i]);
                sum = Integer.parseInt(split[i]);
            }else {
                multiplication = multiplication * Integer.parseInt(split[i]);
                sum = sum + Integer.parseInt(split[i]);
            }
        }
        return multiplication - sum;
    }

}
