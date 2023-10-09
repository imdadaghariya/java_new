import java.util.ArrayList;
import java.util.List;
public class annagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        List<Character> anna = new ArrayList<>();
        List<Character> anna1 = new ArrayList<>();
        int j =0;
        for(int i = 0;i< str1.length();i++){
            
                anna.add(str1.charAt(i));
                anna1.add(str2.charAt(j));
                j++;
        }
        
        anna.sort(null);
        anna1.sort(null);

        if(anna.equals(anna1)){
            System.out.println("Is annagram");
        }
        else{
            System.out.println("Not annagram");
        }

    }
}
