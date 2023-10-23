
public class CharacterCounter {
    public static void main(String[] args) {
        String input = "hello"; // Replace this with the desired string.
        countCharacters(input);
    }
    
    public static void countCharacters(String str) {
        for(int i = 0;i< str.length();i++){
            char currentchar = str.charAt(i);
            if(currentchar == '\0'){
                continue;
            }
            int count =1;
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(j) == currentchar){
                    count++;
                    str = str.substring(0, j) + '\0' + str.substring(j+1);
                }
            }
            if(currentchar !='\0'){
                System.out.println(currentchar + "      occurs     " + count + "        Times");
            }
        }
    }
}
