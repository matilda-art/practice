import java.util.HashSet;
import java.util.Scanner;

/**
 * @program: 下厨房
 * @description
 * 题目：每种料理需要一些不同的材料，问完成所有的料理需要准备多少种不同的材料、
 *
 * 思路：使用set进行去重
 * @author: matilda
 * @create: 2020-06-03 19:09
 **/
public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            String str = scanner.nextLine();
            String[] arr = str.split(" ");

            for (String s:arr) {
                hashSet.add(s);
            }
        }
        System.out.println(hashSet.size());
    }
}
