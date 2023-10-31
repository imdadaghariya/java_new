package Prep;

import java.util.HashSet;

public class twosum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,3};
        int target = 8;
        HashSet<Integer> sum = new HashSet<>();
        for(int num : arr){
            int rem = target - num;
            if(sum.contains(rem)){
                System.out.println("Contains the numbers that add up to target");
            }
            sum.add(num);
        }
    }
}
