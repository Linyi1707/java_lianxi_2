package Java_test.test_3.src.day_8;

import java.util.Scanner;

public class test_4 {
    public static void main(String[] args) {
        Scanner run = new Scanner(System.in);
        System.out.print("输入要拨打号码的序号：");
        if (run.hasNextInt()) {
            int num = run.nextInt();
            switch (num) {
                case 1 -> System.out.print("正在拨通爸爸的号码...");
                case 2 -> System.out.print("正在拨通妈妈的号码...");
                case 3 -> System.out.print("正在拨通爷爷的号码...");
                case 4 -> System.out.print("正在拨通奶奶的号码...");
                default -> System.out.print("暂无号码");
            }
        } else {
            System.out.print("输入错误！");
        }
    }
}
