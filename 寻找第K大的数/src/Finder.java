/**
 * @program: 寻找第K大的数
 * @description
 *有一个整形数组，请你根据快速排序的思路，找出数组中第K大的数。
 * 给定一个整型数组a，同时给定它的大小n和要找的K(K在1到n之间)，请返回第K大的数，保证答案存在。
 * @author: matilda
 * @create: 2020-05-31 21:12
 **/

//运用了快速排序的思路
public class Finder {

    public int findKth(int[] a, int n, int K) {
        return quick(a,0,n-1,K);
    }

    //利用快排，将大的放前面，小的放后面
    public static int partition(int[] a,int low,int high){
        int tmp = a[low];
        while (low < high){
            while (low < high && a[high] <= tmp){
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] >= tmp){
                low++;
            }
            a[high] = a[low];
        }
        a[low] = tmp;
        return low;
    }

    public static int quick(int[] a,int low,int high,int K){
        int par = partition(a,low,high);
        if (K == par-low+1){
            return a[par];//第K大的元素就是par下标对应的值，因为快排将前半部分的数依次从大到小存放
        }else if (K > par-low+1) {
            return quick(a, par+1, high,K-par+low-1);//递归，在后半段找
        }else {
            return quick(a, low, par-1,K);//递归，直接在前半段找
        }
    }
}
