package chatGPTQuestion;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubstringFinder {
    public static void main(String[] args) {
        String input = "abcdabcdebb"; // Replace this with the desired string.
        int result = findLengthOfLongestSubstring(input);
        System.out.println("The length of the longest substring without repeating characters is: " + result);
    }
    
    public static int findLengthOfLongestSubstring(String str) {
        HashSet<Character> h1 = new HashSet<>();
        char arr[] = str.toLowerCase().toCharArray();
        int len =0;
        for(char ch : arr){
            if(!h1.contains(ch)){
                h1.add(ch);
                len++;
            }
        }
        return len;
    }
}
