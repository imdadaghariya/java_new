package chatGPTQuestion;
import java.util.ArrayList;
public class Intersection {
    public static void main(String []args){
        int[] nums1 = {1, 2, 2, 3, 4};
        int[] nums2 = {2, 2, 4, 5};
        ArrayList<Integer> Intersection = new ArrayList<>();
        int i =0, j = 0;
        while(i < nums1.length && j<nums2.length ){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j] < nums1[i]){
                j++;
            }
            else{
                if(Intersection.isEmpty() || Intersection.get(Intersection.size()-1) != nums1[i]){
                    Intersection.add(nums1[i]);
                }
                i++;
                j++;
            }
        }

        int[] Intersection_array = new int[Intersection.size()];
        for(int k = 0;k< Intersection.size();k++){
            Intersection_array[k] = Intersection.get(k);
        }

        System.out.println("Intersection Array ");
        for(int k = 0;k<Intersection_array.length;k++){
            System.out.println(Intersection_array[k]);
        }
    }
}
