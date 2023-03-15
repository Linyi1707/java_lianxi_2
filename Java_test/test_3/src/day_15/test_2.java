package day_15;

public class test_2 {
    public static void main(String[] args) {
        int jig = 0;
        for (int i = 0; i <= 10; i++) {
            jig = jig + i;
            if (jig > 20) {
                System.out.println(jig);
                break;
            }
        }

    }
}
