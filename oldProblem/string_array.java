


public class string_array {
    public static void main(String[] args) {
        String str = "ashashimdadishdadhijab";
        int times = 0;

        // Iterate through the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Skip counting if this character has already been counted
            if (currentChar == '\0') {
                continue;
            }
            
            int count = 1;

            // Iterate through the rest of the string to count occurrences of the current character
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                    // Mark the counted character as processed
                    str = str.substring(0, j) + '\0' + str.substring(j + 1);
                    System.out.println(str.substring(0, j));
                    System.out.println(str.substring(j + 1));
                    System.out.println(str);
                    System.out.println(times++ + "Time");
                    System.out.println("Current   "+ str);
                }
            }

            // Print the character and its count
            if (currentChar != '\0') {
                System.out.println("Character '" + currentChar + "' occurs " + count + " times.");
            }
        }
    }
}

