package Java_test.April;

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String k1 = "*******************开始游戏****************";
        String k2 = "*******************结束游戏****************";
        System.out.println(k1);
        Random run = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("请输入您的基础金额：");
        int money = in.nextInt();
        if (money >= 100000000) {
            System.out.print("请输入合理的数值(不要超过一亿)！");
        } else {
            System.out.println("您现在的余额为" + money);
        }
        while (true) {
            int[] list = new int[10];
            for (int i = 0; i < list.length; i++) {
                int sum = run.nextInt(9);
                list[i] = sum;
            } while (true) {
                int data1 = money;
                int data3 = 0;
                int jiang = 0;
                if (money <= 0) {
                    System.out.print("余额过少，请充值：");
                    money = in.nextInt();
                } else {
                    System.out.print("请输入想要投入的金额：");
                    data3 = in.nextInt();
                    jiang = data3;
                    money = money - jiang;
                    jiang = jiang * 2 / 3;
                    int data2 = jiang;
                    System.out.print("您现在的余额为" + money);
                    break;
                } //if (jiang < 100)
            }

        }
    }
}
