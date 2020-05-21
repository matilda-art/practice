/**
 * @program: 比较退格的字符串
 * @description
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *
 * 注意：如果对空文本输入退格字符，文本继续为空。

 * @author: matilda
 * @create: 2020-05-21 15:57
 **/

//从字符串末尾开始，遇到多少个‘#’就跳过多少字符.
//代码中用“count”来计数，然后返回最终字符串，比较俩个最终字符串看看是否相等。
public class Solution {

    public String range(String str){
        int count = 0;
        StringBuffer sb = new StringBuffer("");
        for (int i = str.length()-1; i >= 0 ; i--) {
            if (str.charAt(i) == '#'){
                count++;
            }else {
                if (count != 0){
                    count--;
                }else {
                    sb.append(String.valueOf(str.charAt(i)));
                }
            }
        }
        return sb.toString();
    }

    public boolean backspaceCompare(String S, String T) {
        if (S == null || T == null)return false;
        String str1 = range(S);
        String str2 = range(T);
        if (str1.equals(str2)){
            return true;
        }
        return false;
    }
}
