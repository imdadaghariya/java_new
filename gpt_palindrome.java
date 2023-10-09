public class gpt_palindrome {
    public static void main(String[] args) {
        String input = "imdadhusain";
        boolean isPalindrome = true;
        String str = input.replaceAll("\\s", "").toLowerCase();
        StringBuilder reversed = new StringBuilder();
        int i = str.length() - 1; // Initialize i to the last index of the string

        while (i >= 0) {
            reversed.append(str.charAt(i));
            i--;
        }

        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != reversed.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
