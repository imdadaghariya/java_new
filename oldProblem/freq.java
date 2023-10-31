import java.util.HashMap;

public class freq {
    public static void main(String[] args) {
        String str = "Imdadhusain Aghariya! us the hero not done anything?/,,/";
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        HashMap<Character, Integer> freq = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(freq.containsKey(ch)){
                freq.put(ch, freq.get(ch)+1);
            }
            else{
                freq.put(ch,1);
            }
        }
        System.out.println(freq.keySet());
        for(char ch : freq.keySet()){
            System.out.println(ch + "   " + freq.get(ch));
        }
    }
}
