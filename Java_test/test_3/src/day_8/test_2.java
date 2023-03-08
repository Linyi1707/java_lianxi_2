package day_8;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        Scanner run = new Scanner(System.in);
        System.out.print("输入分数：");
        if (run.hasNextInt()) {
            int cgj = run.nextInt();
            if (cgj == 100) {
                System.out.println("买车");
            } else if (cgj >= 90) {
                System.out.println("买MP4");
            } else if (cgj >= 60) {
                System.out.println("买参考书");
            } else {
                System.out.println("好好学习");
            }
        } else {
            System.out.println("输入错误!");
        }
    }
}
