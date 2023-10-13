public class PalindromeChecker {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama!";
        boolean isPalindrome = isPalindrome(input);
        
        if (isPalindrome) {
            System.out.println("The input is a valid palindrome.");
        } else {
            System.out.println("The input is not a valid palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int j = str.toCharArray().length-1;
        char rev[] = new char[j];
        for(char ch : str.toCharArray()){
            rev[j] = ch;
            j++;
        }
        int i =0;
        char sr[] = str.toCharArray();
        while(j>=0 &&i< rev.length ){
            if(rev[j] == sr[i]){
                i++;
                j--;
                break;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
