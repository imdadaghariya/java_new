
import java.util.ArrayList;
public class arraylist {
    public static void main(String []args){
        ArrayList<Integer> Intersetion = new ArrayList<>();
        int nums1[] = {2, 3,4,5,6};
        for(int num:nums1){
            Intersetion.add(num);
        }
        System.out.println(Intersetion.add(Intersetion.size()-1));
    }
}
