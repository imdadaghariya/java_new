import java.util.ArrayList;
public class Union_by_list {
    public static void main(String[] args) {
        int nums1[] = {2, 5, 8, 9, 12, 15, 20, 21};
        int nums2[] = {5, 9, 11, 12, 13, 20, 25};
        // ArrayList<Integer> Union = new ArrayList<>();
        ArrayList<Integer> add_toys = new ArrayList<>();               
        for(int k : nums1){
            if(!add_toys.contains(k)){
                add_toys.add(k);
            }
        }
        
        for(int i : nums2){
            if(!add_toys.contains(i)){
                add_toys.add(i);
            }
        }
        int []Union  = new int[add_toys.size()];
        for(int k=0  ;k<add_toys.size();k++){
            Union[k] = add_toys.get(k);
            System.out.println(Union[k]);
        }
    }
}
