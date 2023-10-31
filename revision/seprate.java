package revision;

import java.util.ArrayList;

public class seprate {
    public static void main(String[] args) {
        String input = "Hello123@World456!";
        input = input.toLowerCase();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> character = new ArrayList<>();
        ArrayList<Character> spl = new ArrayList<>();
        for(char ch : input.toCharArray()){
            int asci = ch - '0';
            if(asci >=0 && asci <=9){

                numbers.add(Integer.parseInt(String.valueOf(asci)));
            }
            else if(ch >= 'a' && ch <= 'z' ){
                character.add(ch);
            }
            else{
                spl.add(ch);
            }
        }
        System.out.println(numbers.toString());
        System.out.println(character.toString());
        System.out.println(spl.toString());
    }
}
