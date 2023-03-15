package day_15;

public class test_4_1 {
    public static void main(String[] args) {
        var stu = "";
        for (var i = 1; i < 10; i++) {
            for (var j = 1; j <= i; j++) {
                stu += i + "*" + j + "=" + i * j  + "\t";
            } stu += "\n";
        } System.out.println(stu);
    }
}
