import java.util.HashMap;
import java.util.Map;

/**
 * @program: 字符串中的第一个唯一字符
 * @description
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。
 * 如果不存在，则返回 -1。
 * @author: matilda
 * @create: 2020-05-29 22:09
 **/
public class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> hashMap = new HashMap<>();
        //建立哈希表
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i),hashMap.getOrDefault(s.charAt(i),0)+1);
        }

        //找到下标
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
