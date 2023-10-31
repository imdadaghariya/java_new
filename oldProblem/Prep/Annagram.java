package Prep;

import java.util.HashMap;

public class Annagram {
    public static void main(String[] args) {
        String str1 = "imdattd";
        String str2 = "daditmt";
        HashMap<Character, Integer> Map1 = new HashMap<>();
        HashMap<Character, Integer> Map2 = new HashMap<>();

        for(char ch : str1.toCharArray()){
            if(Map1.containsKey(ch)){
                Map1.put(ch,Map1.get(ch)+1);
            }
            else{
                Map1.put(ch, 1);
            }
        }
        for(char ch : str2.toCharArray()){
            if(Map2.containsKey(ch)){
                Map2.put(ch,Map2.get(ch)+1);
            }
            else{
                Map2.put(ch, 1);
            }
        }

        boolean same = true;
        for(char ch: Map1.keySet()){
            if(Map1.get(ch) != Map2.get(ch)){
                same = false;
            }
        }
        if(same){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
