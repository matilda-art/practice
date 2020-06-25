import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @program: 成绩排序
 * @description
 * 查找和排序：
 *  输入任意（用户，成绩）序列，可以获得成绩从高到低或从低到高的排序
 *  相同成绩都按先录入排序在前的规则处理
 *
 *  输入描述：按照指定方式输出名字和成绩，名字和成绩之间以一个空格隔开
 *
 * 使用比较器进行排序
 * @author: matilda
 * @create: 2020-06-25 09:03
 **/

public class Main {
    static class Student{
        String name;
        int score;
        int number;

        public Student(String name, int score, int number) {
            this.name = name;
            this.score = score;
            this.number = number;
        }
    }

    public static void main(String[] args) {
        //1.处理输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();

        boolean ascOrDesc = true;//true代表升序，false代表降序
        if (a == 0){
            ascOrDesc = false;
        }
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int score = scanner.nextInt();
            students[i] = new Student(name,score,i);
        }

        //因为我要调用的排序方法是Arrays.sort
        if (ascOrDesc){
            Arrays.sort(students,new AscComparator());
        }else {
            Arrays.sort(students,new DescComparator());
        }

        //3.处理输出
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].name + " " +students[i].score);
        }
    }

    //传入两个student，谁应该靠前
    static class AscComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1,Student o2) {
/*            if (o1.score != o2.score){
                return o1.score - o2.score;
            }else {
                return o1.number - o2.number;
            }*/
            if (o1.score < o2.score){
                return -1;//只要的负数就代表o1靠前
            }else if (o1.score > o2.score){
                return 1;//返回证书就代表o2靠前
            }else {
                //代表成绩相同
                if (o1.number < o2.number){
                    return -1;
                }else {
                    return 1;
                }
            }
        }
    }

    static class DescComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.score != o2.score){
                return o2.score - o1.score;
            }else {
                return o1.number - o2.number;
            }
        }
    }
}
