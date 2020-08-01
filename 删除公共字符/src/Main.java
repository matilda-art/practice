import java.util.Scanner;

/**
 * @program: 删除公共字符
 * @description
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。
 * 例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 *
 * 思路：使用replaceAll
 * @author: matilda
 * @create: 2020-07-16 22:53
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            String str = "[" + s2 +"]";
            String res = s1.replaceAll(str,"");
            System.out.println(res);
        }
    }
}
