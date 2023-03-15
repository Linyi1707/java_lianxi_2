package day_15;

public class test_3_1 {
    public static void main(String[] args) {
        String jie = "";
        String jig = "*";
        String jeg = "";
        for (int j = 1; j < 6; j++) {
            jie += " ";
            jeg += jie + jig + "\n";
            jig += "**";
           } 
        System.out.print(jeg);

    }
}
