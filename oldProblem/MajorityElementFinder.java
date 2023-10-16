package chatGPTQuestion;
public class MajorityElementFinder {
    public static void main(String[] args) {
        int[] nums = {3,3,4,4,4,1,5,6,7,8,9}; // Replace this with the desired array.
        int majorityElement = findMajorityElement(nums);
        if (majorityElement != -1) {
            System.out.println("The majority element is: " + majorityElement);
        } else {
            System.out.println("There is no majority element in the array.");
        }
    }

    public static int findMajorityElement(int[] nums) {
       int idx = 0;
        int prevCount = 0;
        for(int i= 0;i<nums.length;i++){
            int count = 1;
            if(nums[i] == -1){
                continue;
            }
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                    nums[j] = -1;
                }
            }
           if(count> nums.length/2){
            return nums[i];
           }
            
            
        }
        return nums[idx];
        
        
    }
}
