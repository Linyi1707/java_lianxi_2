package day_13;

public class test_2 {
    public static void main(String[] args) {
        int i = 1;
        int s = 0;
        do {
            i = i + 1;
            if (i % 2 == 0) {
                s = s + i;
            }
        }  while (i <= 100);
        System.out.println(s);
    }
}
