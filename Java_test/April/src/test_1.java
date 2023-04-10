package Java_test.April.day_3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.LinkedList;

public class test_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        System.out.println(list.size());
        for (Object o : list) {
            System.out.println(o);
        }
        LinkedList arr = new LinkedList();
        arr.addFirst("person");
        arr.addLast("age");
        arr.removeFirst();
        System.out.print(arr.getFirst());
    }
}
