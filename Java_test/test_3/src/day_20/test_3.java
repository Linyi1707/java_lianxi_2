package Java_test.test_3.src.day_20;
import java.util.Arrays;
public class test_3 {

    public static void main(String[] args) {
            System.out.println("sortTest");
            int[] arr={6,3,8,2,9,1};
            System.out.println(Arrays.toString(arr));
            for (int i=0;i<arr.length-1;i++){
                for (int j=0;j<arr.length-1-i;j++){
                    int temp;
                    if (arr[j]>arr[j+1]) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
    }
}
