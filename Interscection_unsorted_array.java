import java.util.ArrayList;
public class Interscection_unsorted_array {
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 8, 9, 12, 15, 20, 21};
        int[] nums2 = {5, 9, 11, 12, 13, 20, 25};
        ArrayList<Integer> Intersection = new ArrayList<>();
        for(int i= 0;i<nums1.length;i++){
            boolean common = false;
            for(int j = 0 ;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    common = true;
                    break;
                }
            }
            if(common && !Intersection.contains(nums1[i])){
                Intersection.add(nums1[i]);
                System.out.println(nums1[i]);
            }

        }

    }
}
