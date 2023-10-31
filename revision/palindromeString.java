package revision;

import chatgptQuestion.pal;

public class palindromeString {
    public static void main(String[] args) {
        String str = "wowf";
        int j =str.length()-1;
        boolean ispali = true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) !=str.charAt(j)){
                ispali = false;
                break;
            }
            j--;
        }
        if(ispali){
            System.out.println("string is plaindrome");}
        else{
            System.out.println("Is not palindrome");
        }
           
    }
}
