package chatgptQuestion;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        String input = "hello!imdad"; 
        countVowelsAndConsonants(input);
    }
    
    public static void countVowelsAndConsonants(String str) {
        int vcount = 0;
        int ccount =0;
       for(int i = 0 ;i< str.length();i++){
        char ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            vcount++;
        }
        else if(ch > 'a' && ch < 'z'){
            ccount++;
        }
       }
       System.out.println(vcount + "     " +  ccount);

    }
}
