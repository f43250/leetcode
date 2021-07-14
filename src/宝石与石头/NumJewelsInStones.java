package 宝石与石头;

/**
 * @author FLE
 * @description 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * @time 2021/1/21 16:44
 */
public class NumJewelsInStones {

    public static void main(String[] args) {
        System.err.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        String[] jewelsArray = jewels.split("");
        String[] stonesArray = stones.split("");
        for (String s : jewelsArray) {
            for (String value : stonesArray) {
                if (s.equals(value)) count++;
            }
        }
        return count;
    }
}
