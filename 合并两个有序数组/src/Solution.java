import java.util.Arrays;

/**
 * @program: 合并两个有序数组
 * @description
 * 给你两个有序整数数组nums1和nums2，请你将nums2合并到nums1 中，使nums1成为一个有序数组
 * 说明：
 * 初始化nums1和nums2的元素数量分别为m和n
 * 假设nums1有足够的空间（空间大小大于或等于m+n）来保存nums2中的元素
 * @author: matilda
 * @create: 2020-07-28 09:46
 **/
public class Solution {

    //方法二：双指针/从前往后
    //对于有序数组可以通过双指针法达到O(n+m)的时间复杂度。
    //将指针p1置为nums1的开头，p2为nums2的开头，在每一步将最小值放入输出数组中。
    //由于nums1是用于输出的数组，需要将nums1中的前m个元素放在其他地方，也就需要O(m)的空间复杂度
    public void merge2(int[] nums1, int m, int[] nums2, int n){
        //将nums1复制入新的数组
        int[] nums1_copy = new int[m];
        System.arraycopy(nums1,0,nums1_copy,0,m);

        //定义指向nums1_copy和nums2数组开头的两个指针
        int p1 = 0;
        int p2 = 0;

        //定义一个指向nums1的指针
        int p = 0;

        //比较nums1_copy和nums2中元素的大小，并且将最小的添加入nums1中
        while ((p1 < m) && (p2 < n))
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];

        //如果还有元素要添加
        if (p1 < m)
            System.arraycopy(nums1_copy,p1,nums1,p1 + p2,m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2,p2,nums1,p1 + p2,m + n - p1 - p2);
    }

    //方法一：合并后排序
    //将两个数组合并之后再排序。时间复杂度为：O((n+m)log(n+m))
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}
