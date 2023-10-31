package revision;

import java.util.ArrayList;

public class reversewordbyword {
    public static void main(String[] args) {
        String str = "the sky is blue";
        StringBuilder word = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for(char ch : str.toCharArray()){
            if(ch != ' '){
                word.append(ch);
            }
            else{
                arr.add(word.toString());
                word = new StringBuilder();
                
            }
        }
        arr.add(word.toString());
        for(int i = 3;i>=0;i--){
            System.out.println(arr.get(i));
        }
    }
}
