public class PalindromeChecker {
    public static void main(String[] args) {
        int number = 12321; // Replace this with the desired number.
        if (isPalindrome(number)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
    
    public static boolean isPalindrome(int number) {
        int ori = number;
        int rev=0;
        int rem = 0;
        while(number>0){
            rem = number%10;
            rev = rev *10 +rem;
            number=number/10;
        }
        if(rev==ori){
            return true;
        }
        else{
            return false;
        }
    }
}
