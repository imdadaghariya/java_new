import java.util.HashMap;
public class gpt_freq_array {
    public static void main(String[] args) {
        String input = "Hello world. This is a hello world example. Hello, World!";
        String updated = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for(int i = 0;i<updated.length();i++){
            int count = 1;
            char ch = updated.charAt(i);
            if(ch == '\0'){
                continue;
            }
            for(int j =i+1 ;j<updated.length();j++ ){
                if(ch == updated.charAt(j)){
                    count++;
                    updated = updated.substring(0, j) + '\0' + updated.substring(j+1);
                }
            }
            System.out.println(ch +"        Occur     "+ count+"   Times ");
        }
    }
}
