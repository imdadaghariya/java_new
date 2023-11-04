package revision;

import java.util.HashSet;

public class longestSubstring {
    public static void main(String[] args) {
        String str = "abcabcefbb";
        HashSet<Character> substr = new HashSet<>();
        int lengthsofar =0;
        int currentlen = 0;
        for(char ch : str.toCharArray()){
            if(!substr.contains(ch)){
                substr.add(ch);
                currentlen++;
            }
            else{
                if(currentlen > lengthsofar){
                    lengthsofar = currentlen;
                }
                currentlen = 0;
                substr = new HashSet<>();

            }
        }
        System.out.println(lengthsofar);
    }
}
