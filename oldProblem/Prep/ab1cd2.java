package Prep;

public class ab1cd2 {
    public static void main(String[] args) {
        String str = "abc1de4";
        StringBuilder  output = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            int chr = ch -'0';
            System.out.println(chr);
            if(chr >=1 && chr<=9){
                while(chr >= 1){
                    output.append(word.toString());
                    chr--;
                }
                word = new StringBuilder();
            }
            else{
                word.append(ch);
            }
        }
        System.out.println(output.toString());
    }
}
