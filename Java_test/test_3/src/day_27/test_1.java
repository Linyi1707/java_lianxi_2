package Java_test.test_3.src.day_27;

import java.util.Scanner;

public class test_1 {
    public static void main(String[] args) {
        Scanner run = new Scanner(System.in);
        System.out.println("欢迎注册会员！");
        do {
            System.out.print("请输入用户名（长度不能小于三位）：");
            String name = run.next();
            if (name.length() < 3) {
            System.out.println("用户名长度不能小于三位！");
            } else {
                break;
            }
        } while (true);
        do {
            System.out.print("请输入密码（长度不能小于六位）：");
            String password = run.next();
            System.out.print("请确认密码：");
            String password2 = run.next();
            if (password.length() < 6) {
                System.out.println("密码长度不能小于六位！");
            } else if (password2.equals(password)) {
                break;
            } else {
                System.out.println("需与原密码相同！");
            }
        } while (true);
        do {
            System.out.print("请输入身份号码（16位或18位，最后一位为X需大写）：");
            String id = run.next();
            if (id.length() == 16 || id.length() == 18) {
                break;
            } else {
                System.out.println("身份号码位数为16位或18位，最后一位为X需大写！");
            }
        } while (true);
        do {
            System.out.print("请输入手机号码（需十一位）：");
            String cell = run.next();
            if (cell.length() != 11) {
                System.out.println("手机号码需11位号码！");
            } else {
                break;
            }
        } while (true);
        System.out.println("恭喜您注册成功！");
    }
}
