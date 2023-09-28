

public class Occurence {
    public static void main(String []args){
        int[] numbers = {2, 5, 8, 5, 3, 5, 9, 5, 1, 5};
        int len = numbers.length;
        int count =0;
        int num_to_count = 5;
        System.out.println(len);
        for(int number : numbers){
            if(number == num_to_count){
                count++;
            }
        }
        System.out.println("Number"  + num_to_count + "Occurence" + count);
    }
    
}
