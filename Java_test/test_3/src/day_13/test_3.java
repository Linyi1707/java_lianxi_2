package day_13;

import java.util.Scanner;

public class test_3 {
    public static void main(String[] args) {
            Scanner run = new Scanner(System.in);
            System.out.println("输入1/2：");
            int num1 = run.nextInt();
        switch (num1) {
            case 1 :
                System.out.println("分入1号组；");
                System.out.println("输入对/错:");
                String str1 = run.next();
                int i = 0;
                if (str1.equals("对")) {
                    while (i <= 10) {
                        i = i +1;
                        System.out.println("hello！");
                    }
                } else if (str1.equals("错")) {
                    do {
                        System.out.println("hello!");
                        i = i +1;
                    } while (i <= 10);
                } else {
                    System.out.println("输入错误!");
                }
                break;
            case 2 :
                System.out.println("分入2号组；");
                System.out.println("输入对/错:");
                String str2 = run.next();
                if (str2.equals("对")) {
                    for (int j = 1; j <= 10; j++) {
                        System.out.println("hello!");
                    }
                } else if (str2.equals("错")) {
                    System.out.println("no");
                } else {
                    System.out.println("输入错误!");
                }
                break;
            default:
                System.out.println("输入错误!");
        }
    }
}
