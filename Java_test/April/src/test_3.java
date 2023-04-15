package Java_test.April.src;

import java.util.ArrayList;

public class test_3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add("apple");
        list.add(123);
        list.add(3.5);
        list.add("**");
        list.add("你好");
        list.add("{}");
        list.add("7&8");
        list.add("晴天");
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
