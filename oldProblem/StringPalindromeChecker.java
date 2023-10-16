package chatGPTQuestion;
public class StringPalindromeChecker {
    public static void main(String[] args) {
        String input = "radar".toLowerCase(); // Replace this with the desired string.
        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int j = str.length()-1;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!= str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }
}
