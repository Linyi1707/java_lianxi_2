package day_15;

public class test_3_1 {
    public static void main(String[] args) {
        String jie = "";
        String jig = "";
        for (int i = 2; i <= 10; i = i + 2) {
            jig += " ";
            for (int j = i; j <= 10; j++) {
                jie += "*";
            } 
            jie += "\n";
            jie += jig;
        } System.out.println(jie);
    }
}
