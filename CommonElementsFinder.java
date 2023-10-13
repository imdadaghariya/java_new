import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonElementsFinder {
    public static void main(String[] args) {
        int[] array1 = {4, 7, 2, 9, 1};
        int[] array2 = {2, 5, 9, 8, 1};
        Arrays.sort(array1);        
        Arrays.sort(array2);
        findCommonElements(array1, array2);
    }
    
    public static void findCommonElements(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        List<Integer> num = new ArrayList<>();
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else {
                // Add the common element to the num list
                num.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        System.out.println(num);
    }
}
