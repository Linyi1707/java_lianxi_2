package Java_test.test_3.src.day_8;

import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) {
        Scanner run = new Scanner(System.in);
        System.out.print("成绩秒数：");
        if (run.hasNextInt()) {
            int cge = run.nextInt();
            if (cge < 10) {
                System.out.println("进入决赛，请选择：");

            }
        }
    }
}
