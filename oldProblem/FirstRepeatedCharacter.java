package chatGPTQuestion;
public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String input = "arogramming"; // Replace this with the desired string.
        findFirstRepeatedChar(input);
    }
    
    public static void findFirstRepeatedChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean repeated = true;
            char currentChar = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    repeated = false;
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
