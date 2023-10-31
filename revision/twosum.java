package revision;

import java.util.HashSet;

public class twosum {
    public static void main(String[] args) {
        int nums[] = {3,7,11,15};
        int target = 9;
        HashSet<Integer> contains = new HashSet<>();
        boolean iscontain = false;
        for(int num : nums){
            int rem = target-num;
            if(contains.contains(rem)){
                iscontain =true;
                break;
            }
            contains.add(num);
        }
        if(iscontain){
            System.out.println("Yes they are present");
        }
        else{
            System.out.println("No they are not");
        }
    }
}
