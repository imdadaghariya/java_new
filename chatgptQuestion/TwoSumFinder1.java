package chatgptQuestion;
import java.util.*;

public class TwoSumFinder1{
    public static void main(String[] args) {
        int[] nums = {2, 7,2, 11, 15};
        int target = 9;
        boolean hasSum = hasTwoSum(nums, target);
        if (hasSum) {
            System.out.println("The array has two numbers that add up to the target.");
        } else {
            System.out.println("The array does not have two numbers that add up to the target.");
        }
    }

    public static boolean hasTwoSum(int[] nums, int target) {
     HashSet<Integer> set = new HashSet<>();
     for(int num : nums){
        int rem = target- num;
        if(set.contains(rem)){
            return true;
        }
        set.add(num);
     }
     return false;
    }
}

