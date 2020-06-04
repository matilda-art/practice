/**
 * @program: 删除排序数组中的重复项II
 * @description
 * 思路：用指针遍历，覆盖多出的重复项。
 * @author: matilda
 * @create: 2020-06-04 16:44
 **/
public class Solution {
    public int removeDuplicates(int[] nums){
        int j = 1;
        int count = 1;//记录每个数字出现的次数
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                count++;
            }else {
                count = 1;
            }
            if (count <= 2){
                nums[j] = nums[i];//i遍历到不重复项处，将i位置的值覆盖到j位置，完成对重复项的删除
                j++;//同时i++
            }
        }
        return j;
    }
}
