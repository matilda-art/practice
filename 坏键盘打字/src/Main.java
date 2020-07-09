import java.util.HashSet;
import java.util.Scanner;

/**
 * @program: 坏键盘打字
 * @description
 * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及实际被输入的文字，请你列出
 * 肯定坏掉的那些键。
 *
 * 输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
 * 以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
 * @author: matilda
 * @create: 2020-05-29 10:36
 **/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();
        String actual = scanner.nextLine();

        //把实际的字符转换为大写存放到集合当中
        HashSet<Character> setActual = new HashSet<>();
        for (char s:actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }

        HashSet<Character> setBroken = new HashSet<>();
        for (char t:expected.toUpperCase().toCharArray()) {
            if (!setActual.contains(t) && !setBroken.contains(t)) {
                System.out.print(t);
                setBroken.add(t);
            }
        }
    }
}
