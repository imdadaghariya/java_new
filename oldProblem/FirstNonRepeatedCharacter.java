package chatGPTQuestion;
public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "orogramming";
        findFirstNonRepeatedChar(input);
    }
    
    public static void findFirstNonRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            char currentChar = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                System.out.println("The first non-repeated character is: " + currentChar);
                break;
            }
        }
    }
}
