package Prep;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String input = "abcabcdefbb";
        System.out.println("The Longest Substring with the length   "+ LongestSubString(input));
    }

    public static int  LongestSubString(String str){

        HashSet<Character> substr = new HashSet<>();
        int count = 0;
        int countsofar =0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!substr.contains(ch)){
                substr.add(ch);
                count++;
            }
            else{
                if(count > countsofar){
                    countsofar = count;
                    count =0;
                    substr = new HashSet<>();
                }
            }
        }
        if(count > countsofar){
            return count;
        }
        return countsofar;
    }
}
