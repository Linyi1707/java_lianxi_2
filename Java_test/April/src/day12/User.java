package Java_test.April.src.day12;

import java.util.Scanner;

//class Administrator {
//    String userName;
//    int password;
//    public void show() {
//        System.out.println("用户名：" + userName + "\n密码：" + password);
//    }
//}

public class User {
    public static void main(String[] args) {
        Administrator user1 = new Administrator();
        user1.userName = "Tom";
        user1.password = 123456;
        user1.show();

        Administrator user2 = new Administrator();
        user2.userName = "White";
        user2.password = 654321;
        user2.show();

        Scanner run = new Scanner(System.in);
        System.out.print("是否修改用户密码（y/n）：");
        String pd = run.next();
        if (pd.equals("y")) {
            System.out.println("请选择想要修改的用户名（1/2）：\n1." + user1.userName + "\n2." + user2.userName + ":");
            int xz = run.nextInt();
            if (xz == 1) {
                System.out.println("请输入原密码：");
                int mm = run.nextInt();
                do {
                    if (mm == user1.password) {
                        System.out.println("密码正确，请输入新密码（0-9）：");
                        user1.password = run.nextInt();
                        System.out.println("修改成功！");
                        break;
                    } else {
                        System.out.println("密码错误！请重新输入：");
                    }
                    mm = run.nextInt();
                } while (true);
            } else if (xz == 2) {
                System.out.println("请输入原密码：");
                int mm = run.nextInt();
                while (true) {
                    if (mm == user2.password) {
                        System.out.println("密码正确，请输入新密码（0-9）：");
                        user2.password = run.nextInt();
                        System.out.println("修改成功！");
                        break;
                    } else {
                        System.out.println("密码错误！请重新输入：");
                    } mm = run.nextInt();
                }
            }
        } else if (pd.equals("n")) {
            System.out.println("已取消");
        }
    }
}