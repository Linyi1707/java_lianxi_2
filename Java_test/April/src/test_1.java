package Java_test.April.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class test_1 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        System.out.println(list.size());
        for (Object o : list) {
            System.out.println(o);
        }
        LinkedList<String> arr = new LinkedList<>();
        arr.addFirst("person");
        arr.addLast("age");
        arr.removeFirst();
        System.out.print(arr.getFirst());
    }


}
