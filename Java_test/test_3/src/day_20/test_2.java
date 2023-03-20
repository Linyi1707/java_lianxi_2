package Java_test.test_3.src.day_20;

import java.util.Scanner;

public class test_2 {
    public static void main(String[] args) {
        int[] list = new int[4];
        Scanner run = new Scanner(System.in);
        for (int j = 0; j < list.length; j++) {
            System.out.print("请输入第" + (j + 1) + "家的价格:");
            int data = run.nextInt();
            list[j] = data;
        } for (int i = 0; i < list.length - 1; i++) {
            for (int k = 0; k < list.length - 1 - i; k++) {
                int data2;
                if (list[k] > list[k + 1]) {
                    data2 = list[k];
                    list[k] = list[k + 1];
                    list[k + 1] = data2;
                }
            }
        }  int max = list[3];
           int min = list[0];
           System.out.println("最低的价格是:" + min + "\n最高的价格是:" + max);
    }
}
