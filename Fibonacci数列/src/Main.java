import java.util.Scanner;

/**
 * @program: Fibonacci数列
 * @description
 * @author: matilda
 * @create: 2020-06-03 18:55
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        int f3 = f1 + f2;

        while (true){
            if (f2 == n){
                System.out.println(0);
                break;
            }else if (f2 > n){
                if (Math.abs(f2 - n) > Math.abs(f1 - n)){
                    System.out.println(Math.abs(f1 - n));
                    break;
                }else {
                    System.out.println(f2 - n);
                    break;
                }
            }
            f1 = f2;
            f2 = f3;
            f3 = f1 + f2;
        }
    }
}
