

import java.util.HashMap;

public class string_hash {
    public static void main(String []args){
        String str ="ashashimdadishdadhijab";
        HashMap <Character, Integer> occ_str = new HashMap<>();
        char[] array  = str.toCharArray();
        for(char chr : array){
            if(occ_str.containsKey(chr)){
                occ_str.put(chr , occ_str.get(chr)+1);
            }
            else{
                occ_str.put(chr, 1);
            }
        }
        System.out.println("Occurence");
        System.out.println(occ_str);
    }
}
