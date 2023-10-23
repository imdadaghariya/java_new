
import java.util.Arrays;

public class gtp_max {
    public static void main(String[] args) {
        int []arr = {4, 7, 2, 9, 1, 5, 6};
        int min = Integer.MIN_VALUE;
        int max = 0;
        for(int num : arr){
            if(num > max){
                max = num;
            }
            else if(num < min && num != max){
                min = num;
            }
        }
        System.out.println("Min" + min + "Max" + max);
    }
}
