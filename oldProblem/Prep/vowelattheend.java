package Prep;

import java.util.HashSet;

public class vowelattheend {
    public static void main(String[] args) {
        String str = "imdad";
        HashSet<Character> vowel = new HashSet<>();
        StringBuilder result = new StringBuilder();
        StringBuilder resultv = new StringBuilder();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!vowel.contains(ch)){
                result.append(ch);
            }
            else{
                resultv.append(ch);
            }
        }
        result.append(resultv.toString());
        System.out.println(result.toString());
    }
}
