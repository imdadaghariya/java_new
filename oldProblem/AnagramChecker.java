
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "anagram"; // Replace this with the first string.
        String str2 = "nag a ram"; // Replace this with the second string.
        boolean isAnagram = checkAnagram(str1, str2);
        if (isAnagram) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }
    
    public static boolean checkAnagram(String str1, String str2) {
        str2 = str2.replaceAll("\\s","");
        char arr1[] =str1.toCharArray();
        char arr2[] =str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true; // Change this return statement.
    }
}
