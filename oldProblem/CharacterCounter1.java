
public class CharacterCounter1 {
    public static void main(String[] args) {
        String input = "hello"; // Replace this with the desired string.
        countCharacters(input);
    }
    
    public static void countCharacters(String str) {
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== '\0'){
                continue;
            }
            int count =1;
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(i)== str.charAt(j)){
                    count++;
                    str =str.substring(0,j)+ '\0' + str.substring(j+1);
                }
            }
            
            System.out.println("The Character   " + str.charAt(i)+ "   Occurs  "+  count + "  Times");
        }
    }
}
