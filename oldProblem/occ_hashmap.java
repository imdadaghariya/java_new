package chatGPTQuestion;

import java.util.HashMap;
public class occ_hashmap {
    public static void main(String []args){
        int[] numbers = {2, 5, 8, 5, 3, 5, 9, 5, 1, 5};
        HashMap <Integer, Integer> occ = new HashMap<>();
        for(int number : numbers){
            if(occ.containsKey(number)){
                occ.put(number, occ.get(number)+1);
            }
            else{
                occ.put(number, 1);
            }
        }
        System.out.println("Occurence");
        for(int number : occ.keySet()){
            int count = occ.get(number);
            System.out.println(number+  "   Occurs" + count + "   Times");
        }
    }
}
