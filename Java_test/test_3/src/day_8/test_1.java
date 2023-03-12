package Java_test.test_3.src.day_8;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("中没中：");
            if (in.hasNext()) {
                String cip = in.next();
                switch (cip) {
                    case "中" -> System.out.println("买车");
                    case "没中" -> System.out.println("接着买");
                    default -> System.out.println("输入错误！");
                }
            } else {
                System.out.println("输入错误！");
            }
        }
    }
}
