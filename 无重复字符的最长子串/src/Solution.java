import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: 无重复字符的最长子串
 * @description
 * 给定一个字符串，请你找出其中不含有重复字符的最长子串的长度
 *
 * 思路：滑动窗口
 * @author: matilda
 * @create: 2020-07-29 23:32
 **/
public class Solution {
    public int lengthOfLongestSubstring(String s){
        //哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();

        //右指针，初始值为-1，相当于字符串的左边界的左侧，还没有开始移动
        int rk = -1,ans = 0;
        for (int i = 0; i < n; i++) {
            if (i != 0){
                 //左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))){
                //不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            //第i到rk个字符是一个极长的无重复字符子串
            ans = Math.max(ans,rk - i +1);
        }
        return ans;
    }
}
