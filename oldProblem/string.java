
import java.lang.String;
import java.util.ArrayList;
public class string{
    public static void main(String []args){
        String str = "Imdad 1234 @ gmail .com";
        String []array = new String[7];
        // ArrayList<Integer> numbers = 

        array = str.split(" ");
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
        // System.out.println(String.valueOf(str.charAt(0)));
        // System.out.println(Integer.parseInt(String.valueOf(str.charAt(7))));
        // System.out.println();
        // System.out.println(Character.isDigit(str.charAt(7)));
        // for(char ch : str.toCharArray()){
        //     if(Character.isDigit(Integer.parseInt(String.valueOf(ch )))){

        //     }
        // }

        // }
            String str1 = "Imdadhusain";
            System.out.println(str1.substring(0, 6));
    }
}
