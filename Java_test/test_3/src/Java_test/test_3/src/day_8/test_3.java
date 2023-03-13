package Java_test.test_3.src.day_8;

import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) {
        try (Scanner run = new Scanner(System.in)) {
            System.out.print("成绩秒数：");
            if (run.hasNextInt()) {
                int cge = run.nextInt();
                if (cge < 10) {
                    System.out.println("进入决赛，请选择性别：");
                    String xuz = run.next();
                    if (xuz.equals("男")) {
                        System.out.print("已进入男子组");
                    } else if (xuz.equals("女")) {
                        System.out.print("已进入女子组");
                    } else {
                        System.out.print("输入错误！");
                    }

                } else {
                    System.out.print("比赛结束。");
                }
            } else {
                System.out.print("输入错误！");
            }
        }
    }
}
