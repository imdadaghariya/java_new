package Prep;

import java.util.HashSet;

public class consonant {
    public static void main(String[] args) {
        String str = "palindrome";
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        int count =0;
        for(char ch : str.toCharArray()){
            if(!vowel.contains(ch)){
                count++;
            }
        }
        System.out.println(count);
    }
}
