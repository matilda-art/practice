import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @program: 只出现一次的数字
 * @description
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 * @author: matilda
 * @create: 2020-05-28 16:42
 **/
public class Solution {

    //方法二：用集合完成
    public int singleNumber2(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i])){
                hashSet.remove(nums[i]);
            }else {
                hashSet.add(nums[i]);
            }
        }
        System.out.println(hashSet);
        Iterator<Integer> it = hashSet.iterator();
        return it.next();
    }

    //方法一：将数组所有元素进行异或（最佳选择）
    //相同的数字异或结果是0，而0异或任何数字都是任何数字。
    public int singleNumber1(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }
}
