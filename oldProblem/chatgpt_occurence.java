
import java.util.HashMap;
public class chatgpt_occurence {
    public static void main(String []args){
        String input = "Hello, World!";
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
                if(freq.containsKey(ch)){
                    freq.put(ch, freq.get(ch)+1 );
                }
                else{
                    freq.put(ch,1);
                }
            }

        }
        System.out.println(freq.keySet());
        System.out.println("Occurence");
        for(char num : freq.keySet()){
            int count = freq.get(num);
            System.out.println(num + "  " + count);
        }
    }
}
