import java.util.ArrayList;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int []arr = {10, 22, 9, 33, 21, 50, 41, 60};
        ArrayList<Integer> longestsequest = new ArrayList<>();
        longestsequest.add(arr[0]);
        for(int i =1;i<arr.length;i++){
            if(arr[i] > longestsequest.get(longestsequest.size()-1)){
                longestsequest.add(arr[i]);
            }
        }
        System.out.println(longestsequest);
        System.out.println(longestsequest.size());
    }
}
