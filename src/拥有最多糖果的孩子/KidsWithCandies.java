package 拥有最多糖果的孩子;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author FLE
 * @description 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有最多的糖果。注意,允许有多个孩子同时拥有最多的糖果数目
 * @time 2021/1/21 16:51
 */
public class KidsWithCandies {

    public static void main(String[] args) {
        System.err.println(kidsWithCandies(new int[] {2,3,5,1,3}, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

}
