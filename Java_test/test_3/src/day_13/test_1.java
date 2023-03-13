package day_13;

public class test_1 {
    public static void main(String[] args) {
        int i = 1;
        int s = 0;
        while (i <= 100) {
            i = i + 1;
            if (i % 2 == 0) {
                s = s + i;
            }
        }
        System.out.println(s);
    }
}
