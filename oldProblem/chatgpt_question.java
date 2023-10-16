package chatGPTQuestion;
import java.util.ArrayList;
public class chatgpt_question{
    public static void main(String []args){
        String input = "10, 20, 30, 40, 50";
        String []array = input.split(", ");
        ArrayList<Integer> number = new ArrayList<>();
        for(String num : array){
            number.add(Integer.parseInt(num));
        }
        int sum =0;
        for(int nums : number){
            sum = sum + nums;
        }
        System.out.println(sum);
    }
}