
public class FirstUniqueCharacterFinder {
    public static void main(String[] args) {
        String input = "leetcode"; // Replace this with the desired string.
        char result = findFirstUniqueCharacter(input);
        if (result != '\0') {
            System.out.println("The first unique character is: " + result);
        } else {
            System.out.println("There are no unique characters in the string.");
        }
    }
    
    public static char findFirstUniqueCharacter(String str) {
        for(int i = 0;i<str.length();i++){
            boolean isrepeated = false;
            for(int j = 0;j<str.length();j++){
                if(i !=j && str.charAt(i) == str.charAt(j)){
                    isrepeated = true;
                    break;
                }
            }
            if(!isrepeated){
                return str.charAt(i);
            }
        }
        return '\0'; 
    }
}
