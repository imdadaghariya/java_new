package Prep;

public class reversestring1  {
    public static void main(String[] args) {
        String str = "Yes we have the target";
        StringBuilder words = new StringBuilder();
        String []word = new String[10];
        int j =0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                word[j] = words.toString();
                words = new StringBuilder();
                j++;
            }
            else{
                words.append(str.charAt(i));
            }
        }
        word[j] = words.toString();
        for(int i =word.length-1;i>=0;i--){
            System.out.println(word[i]);
        }
    }
}
