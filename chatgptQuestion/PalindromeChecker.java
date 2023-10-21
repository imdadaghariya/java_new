package chatgptQuestion;

public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!"; // Replace this with the desired string.
        boolean isPalindrome = isPalindrome(input);
        if (isPalindrome) {
            System.out.println("The input is a valid palindrome.");
        } else {
            System.out.println("The input is not a valid palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[\\s,.!]","");
        System.out.println(str);
        return false; // Change this return statement.
    }
}
