package Java_test.test_3.src.day_20;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        int[] list = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;
        Scanner in = new Scanner(System.in);
            System.out.print("请输入所猜号码：");
                int data = in.nextInt();
        for (int j : list) {
            System.out.println(j);
            if (j == data) {
                System.out.println("猜对了");
            }
            sum += j;
        }
        System.out.println("所有元素的和为：" + sum);
    }
}
