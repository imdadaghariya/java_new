package Prep;

public class anagram {
    public static void main(String[] args) {
        String str1 = "imdad";
        String str2 = "dadima";
        
        int count =0;
        if(str1.length() != str2.length()){
            System.out.println("Not Annagram");
        }
        else{
        for(int i =0;i<str1.length();i++){
           
            for(int j =0;j<str2.length();j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count == str1.length()-1){
            System.out.println("Not Annagram");
        }
        else{
            System.out.println(" Annagram");
        }
    }
    }
}
