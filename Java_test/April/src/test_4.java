package Java_test.April.src;

import java.util.HashMap;
import java.util.Map;

public class test_4 {
    public static void main(String[] args) {
        Map<Object, Object> Stu = new HashMap<>();
        Stu.put(1, "Lucy");
        Stu.put(4, "Aimee");
        Stu.put(2, "John");
        Stu.put(5, "Amanda");
        Stu.put(3, "Smith");

        for (Object o : Stu.keySet()) {
            System.out.println(o);
            System.out.println(Stu.get(o));
        }
    }
}
