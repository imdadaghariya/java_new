package Prep;

public class FirstNonRepeated {
    public static void main(String[] args) {
        String input = "programming";
        for(int i =0;i<input.length();i++){
            char ch = input.charAt(i);
            boolean isrepeated = false;
            for(int j =0;j<input.length();j++){
                if(i !=j & ch == input.charAt(j)){
                    isrepeated = true;
                    break;
                }
            }
            if(!isrepeated){
                System.out.println(ch);
                return;
            }
        }
    }
}
