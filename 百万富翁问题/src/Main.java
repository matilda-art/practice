

/**
 * @program: 百万富翁问题
 * @description
 * @author: matilda
 * @create: 2020-07-10 18:40
 **/
public class Main {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        for (int i = 0; i < 30; i++) {
            n = n+10;
            m = (int) (m+Math.pow(2,i));
        }
        System.out.println(n+" "+m);
    }
}