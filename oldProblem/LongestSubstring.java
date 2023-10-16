package chatGPTQuestion;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcabcdbb"; // Replace this with the desired string.
        String longestSubstring = findLongestSubstring(input);
        System.out.println("The longest substring without repeating characters is: " + longestSubstring);
    }
    
    public static String findLongestSubstring(String str) {
        HashSet<Character> sub = new HashSet<>();
        int len = 0;
        for(int i=0;i<str.length();i++){
            if(!sub.contains(str.charAt(i))){
                sub.add(str.charAt(i));
                len++;
            }
        }
        return sub.toString(); // Change this return statement.
    }
}
