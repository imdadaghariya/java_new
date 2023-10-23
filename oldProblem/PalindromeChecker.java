
public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!".toLowerCase(); // Replace this with the desired string.
        boolean isPalindrome = checkPalindrome(input);
        if (isPalindrome) {
            System.out.println("The input is a valid palindrome.");
        } else {
            System.out.println("The input is not a valid palindrome.");
        }
    }
    
    public static boolean checkPalindrome(String str) {
        str = str.replaceAll("[.,!\\s]","");
        System.out.println(str);
        int j = str.length()-1;
        for(int i=0;i<str.length();i++ ){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }

        return true; // Change this return statement.
    }
}
