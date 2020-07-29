/**
 * @program: 区域和检索-数组不可变
 * @description
 * 给定一个整数数组nums，求出数组从索引i到j(i <= j)范围内元素的总和，包含i,j两点
 * @author: matilda
 * @create: 2020-07-29 21:54
 **/
public class NumArray {
    //暴力求解
    //每次调用sumRange时，我们都使用for循环将索引i到j之间的每个元素相加
    private int[] data;
    public NumArray(int[] nums){
        data = nums;
    }

    public int sumRange(int i,int j){
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += data[k];
        }
        return sum;
    }
}
