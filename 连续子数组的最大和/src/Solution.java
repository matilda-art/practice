/**
 * @program: 连续子数组的最大和
 * @description
 * 输入一个整型数组，数组里有整数也有负数。
 * 数组中的一个或连续多个整数组成一个子数组。
 * 求所有子数组的和的最大值
 *
 * 思路：动态规划
 * @author: matilda
 * @create: 2020-07-28 11:40
 **/
public class Solution {
    public int maxSubArray(int[] nums){
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i-1],0);
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
