package day_15;

public class test_3 {
    public static void main(String[] args) {
        int jig = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                jig = jig + i;
            }
        }
        System.out.println(jig);
    }
}
