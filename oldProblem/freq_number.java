package chatGPTQuestion;
import java.util.HashMap;
public class freq_number {
    public static void main(String []match){
        int[] numbers = {1, 2, 3, 2, 1, 3, 4, 5, 4, 6};
        // System.out.println(numbers.length);
        for(int i =0;i<numbers.length;i++){
            int count =1;
            if(numbers[i] != -1){
                for(int j=i+1;j<numbers.length;j++)
                {
                    if(numbers[i] == numbers[j] ){
                        count++;
                        numbers[j] = -1;
                    }
                }
            }
            // System.out.println(count);
            if(numbers[i] != -1){
                System.out.println(numbers[i] + " Occurs" + count +" ");
            }
        }



    // ---------------- By using the Hashmap method ------------------
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: numbers){
            int count = 1;
            if(freq.containsKey(num)){
                count++;
                freq.put(num , freq.get(num)+1);
            }
            else{
                freq.put(num, 1);
            }
        }
        for(int num : freq.keySet()){
            System.out.println(num + " occurs" + freq.get(num) + "Times");
        }

    }
}
