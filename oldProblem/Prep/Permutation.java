package Prep;

import java.util.HashMap;

public class Permutation {
    public static void main(String[] args) {
        String str = "ybghjhbuytb";
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(map1.containsKey(ch)){
                map1.put(ch, map1.get(ch)+1);
            }
            else{
                map1.put(ch, 1);
            }
        }
        long fact =1;
        for(char ch : map1.keySet()){
            fact = fact * fact(map1.get(ch));
        }
        System.out.println(fact);

        long len = fact(str.length());
        long ans = len/fact;
        System.out.println(ans);
        
    }
    public static long fact(long num){
        long fact = 1;
        for(int i =1;i<=num;i++){
            fact = fact*i;
        }
        return fact;

    }
}
