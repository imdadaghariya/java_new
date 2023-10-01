import java.util.ArrayList;
public class string_int_spec_char{
    public static void main(String[] args){
        String input = "Hello123@World456!";
        // String replace = input.replaceAll(" ", "");
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Character> character = new ArrayList<>();
        ArrayList<Character> special = new ArrayList<>();
        for(char ch : input.toCharArray()){
            if(Character.isDigit(ch)){
                number.add(Integer.parseInt(String.valueOf(ch)));
                }
            else if(Character.isLetter(ch)){
                character.add(ch);
            }
            else{
                special.add(ch);
            }
    }
    System.out.println("Character");
    for(int i = 0; i<character.size();i++){
        System.out.println(character.get(i));
    }
    System.out.println("Numbers");
    for(int i = 0;i<number.size();i++){
        System.out.println(number.get(i));
    }
    System.out.println("Special Character");
    for(int i = 0;i<special.size();i++){
        System.out.println(special.get(i));
    }
}
}