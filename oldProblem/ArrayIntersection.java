package chatGPTQuestion;
import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}; // Replace this with the first array.
        int[] nums2 = {2, 2}; // Replace this with the second array.
        int[] intersection = findIntersection(nums1, nums2);
        System.out.println("The intersection of the two arrays is: " + Arrays.toString(intersection));
    }
    
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> inter = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if(!inter.contains(nums1[i]))
                     inter.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[inter.size()];
        for (int k = 0; k < inter.size(); k++) {
            arr[k] = inter.get(k);
        }
        return arr;
    }
}
