
import java.util.HashMap;
public class gpt_freq {
    public static void main(String[] args) {
        String input = "Hello world. This is a hello world example. Hello, World!";
        String case_ins = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(case_ins);
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : case_ins.toCharArray()){
            if(freq.containsKey(ch)){
                int count = freq.get(ch);
                freq.put(ch,count+1 );
            }
            else{
                freq.put(ch, 1);
            }
        }
        System.out.println("Occurence");
        System.out.println(freq);
        for(char num : freq.keySet()){
            System.out.println("Character           " + num + "         Occurs  " + freq.get(num) );
        }
    }
}
