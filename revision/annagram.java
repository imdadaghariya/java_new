package revision;

import java.util.HashMap;

public class annagram {
    public static void main(String[] args) {
        String s = "anaddgram";
        String t = "nagaram";
        HashMap<Character,Integer> sfreq = new HashMap<>();
        HashMap<Character,Integer> tfreq = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(sfreq.containsKey(ch)){
                sfreq.put(ch,sfreq.get(ch)+1);
            }
            else{
                sfreq.put(ch, 1);
            }
        }
        for(char ch : t.toCharArray()){
            if(tfreq.containsKey(ch)){
                tfreq.put(ch,tfreq.get(ch)+1);
            }
            else{
                tfreq.put(ch, 1);
            }
        }

        boolean isann = true;
        for(char ch : sfreq.keySet()){
            if(sfreq.get(ch) != tfreq.get(ch)){
                isann = false;
                break;
            }
        }
        if(isann){
            System.out.println("Is annagram");
        }
        else{
            System.out.println("Is not annagram");
        }
    }
}
