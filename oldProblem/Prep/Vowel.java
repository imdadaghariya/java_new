package Prep;

import java.util.HashSet;

public class Vowel{
    public static void main(String[] args) {
        String str = "Hello, how are you";
        int count = vowelCount(str);
        System.out.println("The vowel in the Sentence are  " + count);
    }

    public static int vowelCount(String str){
        HashSet<Character> vowel = new HashSet<>();
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(str);
        int count =0;
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch =='i' || ch== 'o' || ch == 'u'){
                count++;
                if(!vowel.contains(ch)){
                    vowel.add(ch);
                }
            }
        }
        char[] vowelType = new char[vowel.size()];
        int i =0;
        for(char ch : vowel){
            vowelType[i] = ch;
            i++;
        }
        
        return count;
    }
}