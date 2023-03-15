package day_15;

public class test_4 {
    public static void main(String[] args) {
        int jig;
        String jeg = "";
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                jig = i * j;
                jeg += (j + "*" + i + "=" + jig + "\t");
            }
            jeg += "\n";
        } System.out.println(jeg);
    }
}
