package Java_test.April;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String k1 = "*******************开始游戏****************";
        //String k2 = "*******************结束游戏****************";
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
            int[] list = new int[6];
            for (int i = 0; i < list.length; i++) {
                int sum = run.nextInt(9);
                list[i] = sum;
            } while (true) {
                int data1 = money;
                int data3 = 0;
                int jiang = 0;
                int data2 = 0;
                if (money <= 0) {
                    System.out.print("余额过少，请充值：");
                    money = in.nextInt();
                } else {
                    System.out.print("请输入想要投入的金额：");
                    data3 = in.nextInt();
                    jiang = data3;
                    money = money - jiang;
                    jiang = jiang * 2 / 3;
                    data2 = jiang;
                    System.out.print("您现在的余额为" + money);
                    break;
                } if (jiang < 0) {
                    money = money + data3;
                    break;
                } if (money < 0) {
                    System.out.print("请输入小于余额的金额！");
                    money = data1;
                    break;
                } System.out.print("请输入你的竞猜号码(标准的6位号码)：");
                String data_cai = in.next();
                String[] list_cai = data_cai.split("");
                if (list_cai.length > 6) {
                    System.out.println("请输入标准的6位号码！");
                    break;
                } int a = 0;
                int x = 2;
                for (int g = 0; g < list.length; g++) {
                    if (list_cai[g].equals(list[g])) {
                        a++;
                    }
                } for (int b = 0; b < a; b++) {
                    data2 = data2 * x;
                } if (a == 0) {
                    jiang = 0;
                } else {
                    jiang = data2;
                } money = jiang + money;
                System.out.println("中奖号码为" + Arrays.toString(list) + "\n您猜中了" + a + "个号码，奖金为" + jiang + "，奖金已为您放入余额。\n您的余额为" + money);
                System.out.println("请问还要继续竞猜么？如果不想请请按1,继续请任意输入字符：");
                int sum = in.nextInt();
                if (sum == 1) {
                    break;
                }
            }

        } //System.out.println("你的余额为：%d元");
    }
}
