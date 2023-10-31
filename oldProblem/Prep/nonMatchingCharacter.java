package Prep;

public class nonMatchingCharacter {
    public static void main(String[] args) {
        String str = "imdadhusain";
        for(int i =0;i<str.length();i++){
            int count =1;
            if(str.charAt(i) == '\0'){
                continue;
            }
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    str = str.substring(0, j) + '\0' + str.substring(j+1);
                    count++;
                }
            }
            if(count ==1){
                System.out.println(str.charAt(i));
            }
        }
    }
}
