package Prep;

public class Frequency {
    public static void main(String[] args) {
        String str = "programming";
        for(int i =0;i<str.length();i++){
            
            int count = 1;
            for(int j = i+1;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                    str = str.substring(0, j) + '\0' + str.substring(j+1);
                }
            }
            if(str.charAt(i) != '\0' ){
                System.out.println(str.charAt(i) + "    occors  " + count + "   times");
            }

        }
    }
}
