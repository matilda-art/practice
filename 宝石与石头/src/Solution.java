import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @program: 宝石与石头
 * @description
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 * S中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J中的字母不重复，J 和 S中的所有字符都是字母。
 * 字母区分大小写，因此"a"和"A"是不同类型的石头。

 * @author: matilda
 * @create: 2020-05-28 20:26
 **/
public class Solution {

    //方法二：遍历
    public int numJewelsInStones2(String J, String S) {
        if (S == null || J == null) return 0;
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(i) == J.charAt(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    //方法一：用集合操作
    public int numJewelsInStones1(String J, String S) {
        Set<Character> set = new HashSet<>();

        for (char j : J.toCharArray()) {
            set.add(j);
        }

        int count = 0;
        //接下来遍历石头
        for (char s : S.toCharArray()) {
            if (set.contains(s)) {
                count++;
            }
        }
        return count;
    }
}