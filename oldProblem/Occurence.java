package chatGPTQuestion;
public class Occurence {
    public static void main(String []args){
        int[] numbers = {2, 5, 8, 5, 3, 5, 9, 5, 1, 5};
        int[] freq = new int[numbers.length];
        int visited = -1;
        for(int i =0;i< numbers.length;i++){
            int count = 1;
            for(int j=1;j< numbers.length;j++){
                if(numbers[i] == numbers[j]){
                    count++;
                    freq[j] = visited;
                }
                if(freq[i] != visited){
                    freq[i] = count;
                }
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]  != visited){
                System.out.println("Number            frequency");
                System.out.println(numbers[i]+ "          " + freq[i]);
            }
        }

    }
    
}
