package Prep;

public class removeduplicate {
    public static void main(String[] args) {
        String str = "imdadhusain";
        StringBuilder sb1 = new StringBuilder();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            boolean isrepeated = false;
            if(ch == '\0'){
                continue;
            }
            for(int j =i+1;j< str.length();j++){
                if(ch == str.charAt(j)){
                    str = str.substring(0, j) + '\0' + str.substring(j+1);
                    isrepeated = true;
            }

        }
        if(!isrepeated){
            sb1.append(ch);
        }

    }
    System.out.println(sb1.toString());
    }
 }
