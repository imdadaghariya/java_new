import java.util.ArrayList;
import java.util.List;

public class reverseWord {
    public static void main(String[] args) {
        String input = "What is your name";
        List<String> word = new ArrayList<>();
        StringBuilder words = new StringBuilder();
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i) == ' '){
                word.add(words.toString());
                words = new StringBuilder();
            }
            else{
                words.append(input.charAt(i));
            }
        }
        word.add(words.toString());

        for(int i = word.size()-1;i>=0;i--){
            System.out.println(word.get(i));
        }
    }
}
