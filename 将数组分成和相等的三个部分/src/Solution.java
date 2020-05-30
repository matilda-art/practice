/**
 * @program: 将数组分成和相等的三个部分
 * @description
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 *
 * 形式上，如果可以找出索引 i+1 < j
 * 且满足 (A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1])
 * 就可以将数组三等分。
 * @author: matilda
 * @create: 2020-05-30 15:41
 **/
public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i:A) {
            sum = sum+i;
        }
        if (sum % 3 != 0){
            return false;
        }
        int s = 0;
        int b = 0;
        for (int i:A) {
            s = s+i;
            if (s == sum/3){
                s = 0;
                b++;
            }
        }
        return b>=3;//避免sum为0时，出现可以分成超过三组的情况
    }
}
