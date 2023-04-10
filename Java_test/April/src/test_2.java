import java.util.*;

public class test_2 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "apple");
        map.put("2", "banana");
        map.put("手机", "phone");
        map.put("phone", "手机");
//        System.out.println(map);
//        System.out.println(map.size());
//        System.out.println(map.get("手机"));
//        System.out.println(map.containsKey("phone"));
//        System.out.println(map.containsValue("banana"));
//        System.out.println(map.keySet());
//        System.out.println(map.values());

        var keys = map.keySet();
        //        System.out.println(it);
//        System.out.println(it.hasNext());

        for (Object o : keys) {
            String key = (String) o;
//            System.out.println(key);
            System.out.println(map.get(key));
        }
    }
}
