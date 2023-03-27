package Java_test.test_3.src.day_27;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner run = new Scanner(System.in);
        System.out.print("请输入内容：");
        String data = run.next();
        String[] list = data.split("");
        System.out.print("请输入想要查找的字：");
        String word = run.next();
        int s = 0;
        for (String value : list) {
            if (word.equals(value)) {
                s++;
            }
        } System.out.println("”" + data + "“" + "中包含" + s + "个" + word + "字");
    }
}
