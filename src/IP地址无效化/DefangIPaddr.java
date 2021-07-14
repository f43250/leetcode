package IP地址无效化;

/**
 * @author FLE
 * @description 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
 * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
 * 输入：address = "1.1.1.1"
 * 输出："1[.]1[.]1[.]1"
 * @time 2021/2/2 11:44
 */
public class DefangIPaddr {
    public static void main(String[] args) {

    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
