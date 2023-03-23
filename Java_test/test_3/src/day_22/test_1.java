package day_22;

import java.util.Scanner;
import java.util.Arrays;

public class test_1 {
    public static void main(String[] args) {
        int[] list = new int[4];
        Scanner run = new Scanner(System.in);
        for (int j = 0; j < list.length; j++) {
            System.out.print("请输入第" + (j + 1) + "家的价格：");
            list[j] = run.nextInt();
        } Arrays.sort(list);
        int max = list[0];
        int min = list[0];
        for (int i : list) {
            if (max < list[i]){
              max = list[i];
            }
            if (min > list[i]) {
                min = list[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
