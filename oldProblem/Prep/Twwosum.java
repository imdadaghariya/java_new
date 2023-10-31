package Prep;

import java.util.HashSet;

public class Twwosum {
    public static void main(String[] args) {
        int arr[] = {2,6,7,4,9,1,10};
        int target = 15 ;
        HashSet<Integer> map1 = new HashSet<>();
        boolean isthere = false;
        for(int num: arr){
            int rem = target - num;
            if(map1.contains(rem)){
                isthere = true;
            }
            map1.add(num);
        }

        if(isthere){
            System.out.println("Yes we have the target");
        }
        else{
            System.out.println("No there is no targrt");
        }
    }
}
