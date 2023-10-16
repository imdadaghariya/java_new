package chatGPTQuestion;
import java.util.*;

public class TwoSumFinder {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Replace this with the desired array.
        int target = 9; // Replace this with the desired target.
        boolean hasSum = hasTwoSum(nums, target);
        if (hasSum) {
            System.out.println("The array has two numbers that add up to the target.");
        } else {
            System.out.println("The array does not have two numbers that add up to the target.");
        }
    }

    public static boolean hasTwoSum(int[] nums, int target) {
       int left = 0;
       Arrays.sort(nums);
       int right = nums.length-1;
       while(left < right){
        int sum = nums[left] + nums[right];
        if(sum ==target ){
            return true;
        }
        else if(sum > target){
            right--;
        }
        else{
            left++;
        }
        
       }
         return false;
    }
}
