import java.util.Scanner;

/**
 * @program: 统计回文
 * @description
 *
 * “回文串”是一个正读和反读都一样的字符串，比如“level”或者“noon”等等就是回文串.
 * 花花非常喜欢这种拥有对称美的回文串，生日的时候她得到两个礼物分别是字符串A和字符串B。
 * 现在她非常好奇有没有办法将字符串B插入字符串A使产生的字符串是一个回文串。
 * 你接受花花的请求，帮助她寻找有多少种插入办法可以使新串是一个回文串。
 * 如果字符串B插入的位置不同就考虑为不一样的办法。
 *
 * @author: matilda
 * @create: 2020-05-31 20:43
 **/

public class Main {

    //判断是否为回文串
    public static boolean isHuiWen(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int count = 0;//记录能构成回文串的方法有几个
        for (int i = 0; i <= a.length(); i++) {
            StringBuffer sb = new StringBuffer(a);//构造一个初始化为指定字符串内容的字符串构建器
            sb.insert(i,b);//将b插入到a中的各个位置,i代表a中的各个位置
            if (isHuiWen(sb.toString())){
                count++;//如果是回文串，则次数加1
            }
        }
        System.out.println(count);
    }
}
