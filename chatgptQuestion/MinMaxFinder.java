package chatgptQuestion;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] nums = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5}; // Replace this with the desired array.
        int[] result = findMinMax(nums);
        if (result != null) {
            System.out.println("The minimum element is: " + result[0]);
            System.out.println("The maximum element is: " + result[1]);
        } else {
            System.out.println("The array is empty.");
        }
    }

    public static int[] findMinMax(int[] nums) {
        int min=nums[0];
        int max =0;
        for(int num : nums){
            if(max <= num){
                max = num;
            }
            else if(num <= min){
                min = num;
            }
        }
        return new int[]{min,max} ; // Change this return statement.
    }
}
