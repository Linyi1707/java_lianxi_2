package day_20;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        int[] list = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        Scanner in = new Scanner(System.in);
            System.out.print("请输入所猜号码：");
                int data = in.nextInt();
            for (int i = 0; i < list.length; i++) {
                System.out.println(list[i]);
                if (list[i] == data) {
                    System.out.println("猜对了");
                }
                sum += list[i];
            }
        System.out.println("所有元素的和为：" + sum);
    }
}
