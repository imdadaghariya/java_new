package chatGPTQuestion;
import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {
    public static void main(String[] args) {
        String input = "programming"; // Replace this with the desired string.
                     // 012345678910 
        String result = removeDuplicates(input);
        System.out.println("The string after removing duplicates is: " + result);
    }
    
    public static String removeDuplicates(String str) {
        char arr[] = str.toLowerCase().toCharArray();
        StringBuilder sb1 = new StringBuilder();
        for(int i =0;i<arr.length;i++){
            char ch = arr[i];
            boolean isrepeated = false;
            for(int j =i+1;j<arr.length;j++){
                if(ch == arr[j]){
                    isrepeated = true;
                    break;
                }
            }
            if(!isrepeated){
                sb1.append(ch);
            }
        }
        
        return sb1.toString();
    }
}
