package chatGPTQuestion;
public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "orogramming";
        char firstNonRepeated = findFirstNonRepeated(input);

        if (firstNonRepeated != '\0') {
            System.out.println("The First Non-Repeated Character is: " + firstNonRepeated);
        } else {
            System.out.println("All characters are repeated.");
        }
    }

    public static char findFirstNonRepeated(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            if (!isRepeated) {
                return currentChar;
            }
        }
        return '\0'; // No non-repeated character found
    }
}
