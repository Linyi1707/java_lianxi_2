package day_15;

public class test_1 {
    public static void main(String[] args) {
        int jig = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 != 0) {
            jig += i;
            }
        } System.out.println(jig);
    }
}
